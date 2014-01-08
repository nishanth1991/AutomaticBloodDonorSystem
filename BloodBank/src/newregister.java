import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
public class newregister{
    static JTextField name,pass,fname,lname;
    static JButton submit;
    private static class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        	String fn = fname.getText();
        	String ln = lname.getText();
            String user = name.getText();
            String strpass = pass.getText();
            new newregister1(fn,ln,user,strpass);
            
        }
    }
    newregister(){
        JFrame main = new JFrame("newregister Form Demo- MyCoding.net");
        main.setSize(450, 450);
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        name = new JTextField(10);
        pass = new JTextField(10);
        fname = new JTextField(10);
        lname = new JTextField(10);
        main.setLayout(new GridLayout(0,1));
        JPanel pane = new JPanel();
        main.add(pane);
        pane.add(new JLabel("First Name: "));
        pane.add(fname);
        pane.add(new JLabel("Last Name: "));
        pane.add(lname);
        pane.add(new JLabel("Username: "));
        pane.add(name);
        pane.add(new JLabel("Password: "));
        pane.add(pass);
        submit = new JButton("Submit");
        pane.add(submit);
        submit.addActionListener(new Handler());
 
    }
    public static void main(String args[]){
        new newregister();
 
    }
 
}
