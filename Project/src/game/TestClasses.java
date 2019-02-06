package game;

import java.util.Random;
import java.util.Scanner;

public class TestClasses {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HealthBar c = new HealthBar();
		System.out.println(c.getHealth());
		c.setHealth(30);
		System.out.println(c.getHealth());
		c.addHealth(-5);
		System.out.println(c.getHealth());
		System.out.println(c);
		
		HealthBar health = new HealthBar();
		Interactions a = new Interactions(new Random().nextInt(3), health.getHealth());
		
		running(health, a);
		System.out.println("do you want to keep traveling? answer t or f ");
		Scanner scan = new Scanner(System.in);
		String c1 = scan.nextLine();
		while(c1.equalsIgnoreCase("T"))
		{
			Interactions a1 = new Interactions(new Random().nextInt(3), health.getHealth());
			running(health, a1);
			System.out.println("do you want to keep traveling? answer t or f ");
			Scanner scan1 = new Scanner(System.in);
			String c11 = scan1.nextLine();
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
