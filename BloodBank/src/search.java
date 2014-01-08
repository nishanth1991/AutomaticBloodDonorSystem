import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class search implements ActionListener{
JLabel jlb1,jlb2;
JButton jb1,jb2;
String s;
JFrame frame=new JFrame("Search");
  search()
  {	  
	  frame.setLayout(new FlowLayout());
	  	frame.setSize(300, 300);
	  	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  	frame.setVisible(true);
	  	jlb2=new JLabel("Register As A Donor");
	  	frame.add(jlb2);
	  	jb2 = new JButton("Register");
	  	frame.add(jb2);
	    jb2.addActionListener(this);
	  jlb1 = new JLabel("Search For Donor");
	  frame.add(jlb1);
	  jb1 = new JButton("Enter");
	  frame.add(jb1);
	  jb1.addActionListener(this);
	  
	 
  }
 public void actionPerformed(ActionEvent e)
 { JLabel j= new JLabel();frame.add(j);  
	 s=e.getActionCommand();
	 if(s.equalsIgnoreCase("Enter"))
	 {  
	    new searchops();
	 	}
 if(s.equalsIgnoreCase("Register")){
		 new regdonor();
		 
	 }

	
		 
	 }
 public static void main(String args[])
 {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					new search();
				}
			});
 }
}


