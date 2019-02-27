package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;



public class GameClass 
{
	
	
	private static String name;
	static JFrame frame;
	static JTextField field;
	public static void main(String[] args) 
	{
		getName();
		testName();

	}
	
	
	private int button;
	public GameClass(int button)
	{
	    this.button = button;
	}
	public static void testName()
	{
		
	}




	public static void getName()
	{
		
		frame = new JFrame("Name");
		frame.setDefaultLookAndFeelDecorated(true);
		JButton button = new JButton();
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Put name here");
		label.setLocation(10, 0);
		label.setSize(100, 30);
		field = new JTextField();
		field.setSize(100, 30);
		field.setLocation(10, 30);
		button.setText("Set name");
		button.setSize(100, 30);
		button.setLocation(10, 60);
		panel.setLayout(null);
		panel.add(label);
		panel.add(button);
		panel.add(field);
		panel.setSize(500, 500);
		button.addActionListener((ActionListener) new GameClass(1));
		frame.add(panel);
		frame.setSize(100, 140);
		frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
				
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource().equals(1))
                {
                	name = field.getText();
                }
            }
        });
		
		
	}
	


}
