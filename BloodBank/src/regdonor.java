import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
public class regdonor{
    static JTextField wt,fname,lname;
    static JButton submit;
    static JComboBox BG;
    static JComboBox HL;
    private static class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        	String fn = fname.getText();
        	String ln = lname.getText();
            String  wght= wt.getText();
            String group=(String)BG.getSelectedItem();
            String hosplist=(String)HL.getSelectedItem();
            new regdonor1(fn,ln,wght,group,hosplist);
            
            
        }
    }
    regdonor(){
        JFrame main = new JFrame("regdonor Form Demo- MyCoding.net");
        main.setSize(450, 450);
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       wt = new JTextField(10);
       BG = new JComboBox();
       BG.addItem("A+");
       BG.addItem("B+");
       BG.addItem("O+"); BG.addItem("A-");
       BG.addItem("O-");
       
        fname = new JTextField(10);
        lname = new JTextField(10);
        main.setLayout(new GridLayout(0,1));
        JPanel pane = new JPanel();
        main.add(pane);
        pane.add(new JLabel("First Name: "));
        pane.add(fname);
        pane.add(new JLabel("Last Name: "));
        pane.add(lname);
        pane.add(new JLabel("Weight: "));
        pane.add(wt);
        HL = new JComboBox();
        HL.addItem("MSR");
        HL.addItem("KIMS");
      //  pane.add(new JComboBox("Blood Group: "));
        pane.add(BG);
        pane.add(HL);
        submit = new JButton("Submit");
        pane.add(submit);
        submit.addActionListener(new Handler());
 
    }
    public static void main(String args[]){
        new regdonor();
 
    }
 
}
