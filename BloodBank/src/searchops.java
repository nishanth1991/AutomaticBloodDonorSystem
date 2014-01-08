import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
public class searchops implements ActionListener{
	JButton jb1,jb2;
	String s;
	JFrame frame = new JFrame("SearchOps");
	searchops(){
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,200);
		frame.setVisible(true);
		jb1 = new JButton("Search By Hospital");
		jb2 = new JButton("Search By BloodGroup");
		frame.add(jb1);
		frame.add(jb2);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
	}
	 public void actionPerformed(ActionEvent e)
	 { JLabel j= new JLabel();frame.add(j);  
		 s=e.getActionCommand();
		 if(s.equalsIgnoreCase("Search By Hospital"))
		 {  
		  // nee hname();
		 	}
		 else if(s.equalsIgnoreCase("Search By BloodGroup")){
			 
			new blist();
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



