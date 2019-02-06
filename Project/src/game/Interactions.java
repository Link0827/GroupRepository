package game;

import java.util.Random;
import java.util.Scanner;




public class Interactions 
{
	private int inter;
	
	private static int MONSTERS_HEALTH = 5;
	private int attack;
	private HealthBar health;
	
	private static final String one = "Monsters";
	private static final String two = "Nothing";
	
	public Interactions(int num, int num2)
	{
		inter = num;
		health = new HealthBar();

	}
	public void Attack()
	{
		attack = 5;
	}
	
	public String getInteraction()
	{
		if(inter == 0)
		{
			return one;
		}
		return two;
		
		
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
		return "you have an attack power of " + attack + " and a health of "+ health;
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
			System.out.println("You have had an uneventful day");
		}
		
	}
}
