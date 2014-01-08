import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
public class login{
    static JTextField name,pass;
    static JButton submit;
    private static class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String user = name.getText();
            String strpass = pass.getText();
            try {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nis1991", "nis1991", "password");
                Statement st = con.createStatement();
                String query = "SELECT pass FROM info where username='"+user+"'";
                System.out.println(query);
                ResultSet rs = st.executeQuery(query);
 
                if(rs.next())
                {
                    String dbpass = rs.getString(1);
                    if(dbpass.equals(strpass)){
                   new search();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Login Unsuccessful!","Error",1);
                }
               }
                else
                {
                    JOptionPane.showMessageDialog(null,"Username not found","Error",1);
                }
            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    login(){
        JFrame main = new JFrame("Login Form Demo- MyCoding.net");
        main.setSize(200, 200);
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        name = new JTextField(10);
        pass = new JTextField(10);
        main.setLayout(new GridLayout(0,1));
        JPanel pane = new JPanel();
        main.add(pane);
        pane.add(new JLabel("Username: "));
        pane.add(name);
        pane.add(new JLabel("Password: "));
        pane.add(pass);
        submit = new JButton("Submit");
        pane.add(submit);
        submit.addActionListener(new Handler());
 
    }
    public static void main(String args[]){
        new login();
 
    }
 
}
