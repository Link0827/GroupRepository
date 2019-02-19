package game;

import java.awt.Color;
import java.awt.Frame;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameClass 
{
	
	String name;

	public static void main(String[] args) 
	{
		getName();
		chooseGameStyle();

	}
	
	
	
	
	private static void chooseGameStyle() 
	{
		
	}




	public static void getName()
	{
		
		JFrame frame = new JFrame("Name");
		frame.setDefaultLookAndFeelDecorated(true);
		JButton button = new JButton();
		frame.
		
		JPanel panel = new JPanel();
		
		panel.setLayout();
		
		panel.setBackground(Color.GREEN);
		
		button.setText("When your name has been inputed please click");
		
		panel.add(button);
		button.setLocation(500, 300);
		
		
		frame.add(panel);
		
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
				
		
		
	}
	


}
