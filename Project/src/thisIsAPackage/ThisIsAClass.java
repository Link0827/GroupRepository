package thisIsAPackage;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ThisIsAClass
{
	private static JFrame frame;

	public static void main(String[] args) 
	{
	    JFrame jframe = new JFrame("JFrame Size Example");
	    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    jframe.setPreferredSize(new Dimension(400, 300));
	    jframe.pack();
	    jframe.setLocationRelativeTo(null);
	    jframe.setVisible(true);
	    JButton button = new JButton("this be a button");
	    jframe.add(button);
		
	}
		
}

