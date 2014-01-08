import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
public class register implements ActionListener{
	JButton jb1,jb2;
	String s;
	JFrame frame = new JFrame("SearchOps");
	 register(){
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,200);
		frame.setVisible(true);
		jb1 = new JButton("Register");
		jb2 = new JButton("Login");
		frame.add(jb1);
		frame.add(jb2);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
	}
	 public void actionPerformed(ActionEvent e)
	 { JLabel j= new JLabel();frame.add(j);  
		 s=e.getActionCommand();
		 if(s.equalsIgnoreCase("Register"))
		 {  	frame.setVisible(false);
		    new newregister();
		 	}
		 else if(s.equalsIgnoreCase("Login")){
			 
			new login();
		 }

	 }	
}