package game;

import java.util.Random;

public class TestInteractions {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		
		Interactions a = new Interactions(new Random().nextInt(3));
		System.out.println(a.getInteraction());
		a.Attack();
		System.out.println(a);
		a.interaction();

	}

}
