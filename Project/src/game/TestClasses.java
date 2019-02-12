package game;

import java.util.Random;
import java.util.Scanner;

public class TestClasses {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("If the screen stops after printing a line try to hit the ENTER key on your keyboard.");
		Scanner scan = new Scanner(System.in);
		System.out.println("Like this");
		String c = scan.nextLine();

		
		System.out.println("What is your name?");
		c = scan.nextLine();
		for(int i = 0; i < 3; i++)
		{
			System.out.print("PROSESING NAME...");
		}
		scan.nextLine();
		System.out.println();
		Player player = new Player(c);
		System.out.println("Welcome to the game " + player.getName());

		
		HealthBar q = new HealthBar();
		Interactions a = new Interactions(new Random().nextInt(3), q.getHealth());
		
		running(q, a);
		System.out.println("do you want to keep traveling? answer t or f ");
		Scanner scan1 = new Scanner(System.in);
		c = scan1.nextLine();
		while(c.equalsIgnoreCase("T"))
		{
			Interactions a1 = new Interactions(new Random().nextInt(3), q.getHealth());
			running(q, a1);
			System.out.println("do you want to keep traveling? answer t or f ");
			Scanner scan11 = new Scanner(System.in);
			c = scan11.nextLine();
			if(c.equalsIgnoreCase("f"))
			{
				System.out.println("Thanks for playing");
				
			}
		}
		

	}
	
	public static void running(HealthBar health , Interactions a)
	{
		System.out.println(a.getInteraction());
		a.Attack();
		System.out.println(a);
		a.interaction();
	}

}
