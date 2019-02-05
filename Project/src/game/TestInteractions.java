package game;

import java.util.Random;

public class TestInteractions {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Interactions c = new Interactions(new Random().nextInt(3));
		System.out.println(c.getInteraction());
		c.Attack();
		System.out.println(c);
		c.interaction();

	}

}
