package game;

import java.util.Random;

public class Interactions 
{
	private int inter;
	
	private static int MONSTERS_HEALTH = 5;
	private int attack;
	
	private static final String one = "Monsters";
	private static final String two = "Trader";
	private static final String three = "Nothing";
	
	
	public Interactions(int num)
	{
<<<<<<< HEAD
		
=======
		inter = num;

	}
	public void Attack()
	{
		attack = 5;
>>>>>>> branch 'master' of https://github.com/Link0827/GroupRepository.git
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
			int monsterHealth = MONSTERS_HEALTH *= numMonsters;
			for(int i = 0; i < monsterHealth; i++)
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
