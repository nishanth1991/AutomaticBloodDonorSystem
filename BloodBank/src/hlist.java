
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

import java.awt.*;
import java.sql.*;
public class hlist {
	  static JButton submit;
	  static JComboBox HL;
	  private static class Handler implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	 String group=(String)HL.getSelectedItem();
	          //  new hlist1(group);
	            
	        }
	    }
	  hlist()
	  {
		  JFrame main = new JFrame("regdonor Form Demo- MyCoding.net");
	        main.setSize(450, 450);
	        main.setVisible(true);
	        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        main.setLayout(new GridLayout(0,1));
	        JPanel pane = new JPanel();
	        main.add(pane);
	        HL = new JComboBox();
	        HL.addItem("MSR");
	        HL.addItem("KIMS");	     
	        pane.add(HL);
	      submit = new JButton("Search");
	        pane.add(submit);
	        submit.addActionListener(new Handler());
	 
	  }
	    public static void main(String args[]){
	        new hlist();
	 
}}
