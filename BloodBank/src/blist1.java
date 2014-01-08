import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
class blist1 implements ActionListener {
JTextField jtf1,jtf2,jtf3,jtf4;
JLabel jlb1,jlb2,jlb3,jlb4;
JButton jb;
String s1,s2,s3,s4,s5;
JFrame frame,f;
static String query;
static Statement stmt;
static Connection con;
public static int i;
public static String pq;
public static String a[]=new String[20];
public static String b[]=new String[20];
public static String c[]=new String[20];
public static String d[]=new String[20];

static ResultSet res;
blist1()
{
	
}
  blist1(String p)
  {		
	  pq=p;
	  frame=new JFrame("List Of Donors:");
	  frame.setLayout(new FlowLayout());
  	frame.setSize(1000, 500);
  	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	frame.setVisible(true);  
  	jlb1=new JLabel("LIST OF DONORS",JLabel.LEADING);
  	frame.add(jlb1);
  	con=getConnection();
  	String head[]={"FNAME","LNAME","WEIGHT","BLOOD GROUP"};
  	Object data[][]=new Object[50][4];
  	for(int j=0;j<i;j++)
  	{
  		data[j][0]=a[j];
  		data[j][1]=b[j];
  		data[j][2]=c[j];
  		data[j][3]=d[j];
  	}
  	JTable t=new JTable(data,head);
  	JScrollPane jsp=new JScrollPane(t);
  	frame.add(jsp);
  	jb=new JButton("Back");
	 
	  frame.add(jb);jb.addActionListener(this);
  	
  }
  public void actionPerformed(ActionEvent e)
  {   String s=e.getActionCommand();
  if(s.equals("Back"))
	 {  
					 frame.setVisible(false);
	 	     new searchops(); 
	 	}
		 
	 }
     public static Connection getConnection()
		{	
					
			final String url = "jdbc:mysql://localhost:3306/nishanth1991";	

			try {
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");	

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
					query="SELECT fname,lname,weight,bloodgroup from donor where bloodgroup='"+pq+"'";
				stmt = con.createStatement();
		   		res=stmt.executeQuery(query);

			} catch(SQLException ex) {
				System.err.println("SQLException: " + ex.getMessage());
			}
			try
			{
				String dep;
				 i=0;
				 while(res.next())
					{
						dep= res.getString(1);
						a[i]=dep;
						dep= res.getString(2);
						b[i]=dep;
						dep= res.getString(3);
						c[i]=dep;
						dep= res.getString(4);
						d[i]=dep;
						i++;
					}
					stmt.close();
					con.close();
			}
			catch(SQLException error)
			{
				
			}
			return con;
			
		}
		

	

	 

 public static void main(String args[])
 {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					new blist1();
					
				}
			});
 }
}


