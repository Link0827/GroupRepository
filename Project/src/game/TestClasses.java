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
		
		
		
		
		
		
		
		
		
		
		
		HealthBar c1 = new HealthBar();
		Interactions a = new Interactions(new Random().nextInt(3), c1.getHealth());
		
		running(c1, a);
		System.out.println("do you want to keep traveling? answer t or f ");
		Scanner scan1 = new Scanner(System.in);
		String c11 = scan1.nextLine();
		while(c11.equalsIgnoreCase("T"))
		{
			Interactions a1 = new Interactions(new Random().nextInt(3), c1.getHealth());
			running(c1, a1);
			System.out.println("do you want to keep traveling? answer t or f ");
			Scanner scan11 = new Scanner(System.in);
			String c111 = scan11.nextLine();
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
