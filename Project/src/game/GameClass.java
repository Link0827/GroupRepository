package game;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import com.sun.xml.internal.bind.v2.TODO;



public class GameClass implements  ActionListener
{
	
	static String name;
	JTextField field1;
	JFrame frame1;
	JButton button1;
	JPanel panel1;
	JLabel label1;

	public static void main(String[] args) 
	{
		GameClass game = new GameClass();
		game.startGame();
	}
	public void startGame()
	{
		label1 = new JLabel("Put name here");
		label1.setLocation(10, 0);
		label1.setSize(100, 30);
		
		field1 = new JTextField();
		field1.setSize(100, 30);
		field1.setLocation(10, 30);
		
		button1 = new JButton("Set name");
		button1.setSize(100, 30);
		button1.setLocation(10, 60);
		button1.addActionListener(this);
		
		
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.add(label1);
		panel1.add(button1);
		panel1.add(field1);
		panel1.setSize(500, 500);
		
		frame1 = new JFrame("Name");
		frame1.setDefaultLookAndFeelDecorated(true);
		frame1.add(panel1);
		frame1.setSize(100, 140);
		frame1.setLocationRelativeTo(null);
		frame1.setResizable(true);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == button1)
		{
			name = field1.getText();
        	frame1.dispose();
        	System.out.println(name);
        	
		}
		
	}

	
	


}
