package game;

import java.util.Random;

public class Interactions 
{
	private int inter;
	
	private static final int MONSTERS_HEALTH = 5;
	private int attack;
	
	private static final String one = "Monsters";
	private static final String two = "Trader";
	private static final String three = "Nothing";
	
	
	public Interactions(int num)
	{
		inter = num;
		attack = 5;
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
	public void setAttack(int c)
	{
		attack = c;
	}
	
	public int getAttack()
	{
		return attack;
	}
	
	public String toString()
	{
		return "you have an attack power of " + attack;
	}
	
	
	public void interaction()
	{
		if(inter == 0)
		{
			int numMonsters = new Random(1).nextInt(6);
			System.out.println("You have run into " + numMonsters + " monsters");
			for(int i = 0; i < numMonsters; i++)
			{
				
			}
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
