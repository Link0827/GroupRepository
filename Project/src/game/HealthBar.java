package game;

public class HealthBar 
{

	public int health;
	public HealthBar()
	{
		health = 25;	
	}
	
	public int getHealth()
	{
		return health;
	}
		
	public void setHealth(int num)
	{
		health = num;
	}
	
	public void addHealth(int added)
	{
		health += added;
	}
	
	public String toString()
	{
		return "You have a health level of " + health;
	}
	

	
	
	
	

}
