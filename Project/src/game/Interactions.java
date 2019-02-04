package game;

import java.util.Random;

public class Interactions 
{
	private int inter;
	
	private static final String one = "Monsters";
	private static final String two = "Trader";
	private static final String three = "Nothing";
	
	
	public Interactions(int num)
	{
		inter = num;
	}
	
	public String getInteraction()
	{
		if(inter == 0)
		{
			return one;
		}
		else if(inter == 1)
		{
			return two;
		}
		return three;
		
	}
	
	public void interaction()
	{
		if(inter == 0)
		{
			int numMonsters = new Random().nextInt(6);
			System.out.println("You have run into " + numMonsters + " monsters");
		}
		else if(inter == 1)
		{
			System.out.println("You have found a merchent");
		}
		else if(inter == 2)
		{
			System.out.println("You have had an uneventful day");
		}
	}
	
	
	


}
