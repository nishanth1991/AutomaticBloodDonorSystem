import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class regdonor1 implements ActionListener{
	static String query;
	static Connection con;
	JButton jb;JLabel j;
	JFrame frm=new JFrame("Department");
	regdonor1 (String p,String q,String r,String s,String t )
	{
	 query="INSERT INTO donor(fname,lname,weight,bloodgroup,hospital) VALUES ('"+p+"','"+q+"','"+r+"','"+s+"','"+t+"')";	
	  con=getConnection();
	  frm.setLayout(new FlowLayout());
	  frm.setSize(1000, 500);
	  	frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	  frm.setVisible(true);
	   j=new JLabel("1 record added");
	  jb=new JButton("Back");
	  frm.add(j);
	  frm.add(jb);jb.addActionListener(this);
	  
	}

	 public void actionPerformed(ActionEvent e)
	 { 
	String s5=e.getActionCommand();
		   if(s5.equals("Back"))
		   {
			   frm.setVisible(false);new search();
		   } 
		 }

	public static Connection getConnection()
	{
				
		final String url = "jdbc:mysql://localhost:3306/nishanth1991";	
		final Statement stmt;

		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");	//Class.forName("myDriver.ClassName"); ?

		} catch(java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
			System.err.println(e.getMessage());
		}

		try {
			con = DriverManager.getConnection(url,"nishanth1991","password");

		} catch(SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}
		
		
		try {
			stmt = con.createStatement();
	   		stmt.executeUpdate(query);
			stmt.close();
			con.close();

		} catch(SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}
		return con;
		
	}
	

}

