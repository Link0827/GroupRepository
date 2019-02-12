package thisIsAPackage;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThisIsAClass
{
	private static JFrame frame;
	private static JPanel panel;

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("JFrame Size Example");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setPreferredSize(new Dimension(400, 300));
	    frame.pack();
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	    JButton button1 = new JButton("This be a button");

	    frame.add(button1);

	    
	    

        



	    }
	}

