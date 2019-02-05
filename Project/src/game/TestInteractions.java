package game;

import java.util.Random;
import java.util.Scanner;

public class TestInteractions {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HealthBar health = new HealthBar();
		Interactions a = new Interactions(new Random().nextInt(3), health.getHealth());
		
		running(health, a);
		System.out.println("do you want to keep traveling? answer t or f ");
		Scanner scan = new Scanner(System.in);
		String c = scan.nextLine();
		while(c.equalsIgnoreCase("T"))
		{
			Interactions a1 = new Interactions(new Random().nextInt(3), health.getHealth());
			running(health, a1);
			System.out.println("do you want to keep traveling? answer t or f ");
			Scanner scan1 = new Scanner(System.in);
			String c1 = scan1.nextLine();
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
