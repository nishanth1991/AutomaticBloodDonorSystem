
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 class p implements ActionListener{
p()
	{
	JFrame jf=new JFrame("Java Project");
	jf.setLayout(new FlowLayout());
	jf.setVisible(true);
	jf.setSize(200,200);
	JLabel jl=new JLabel("Emergency Blood System");
	JButton jb=new JButton("ENTER");
	jf.add(jb);
	jf.add(jl);
		jb.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("ENTER"))
		{
			new register();
		}
			
	}

}
public class begin
{
	public static void main(String args[])
	{
		new p();
	}
}
