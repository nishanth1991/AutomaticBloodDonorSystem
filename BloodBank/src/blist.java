
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

import java.awt.*;
import java.sql.*;
public class blist {
	  static JButton submit;	
	  static JComboBox BL;
	  private static class Handler implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	 String group=(String)BL.getSelectedItem();
	            new blist1(group);
	            
	        }
	    }
	  blist()
	  {
		  JFrame main = new JFrame("regdonor Form Demo- MyCoding.net");
	        main.setSize(450, 450);
	        main.setVisible(true);
	        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        main.setLayout(new GridLayout(0,1));
	        JPanel pane = new JPanel();
	        main.add(pane);
	        BL = new JComboBox();
	        BL.addItem("A+");
	        BL.addItem("B+");
	        BL.addItem("O+"); BL.addItem("A-");
	        BL.addItem("O-");
	        pane.add(BL);
	      submit = new JButton("Search");
	        pane.add(submit);
	        submit.addActionListener(new Handler());
	 
	  }
	    public static void main(String args[]){
	        new blist();
	 
}}
