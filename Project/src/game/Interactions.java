package game;

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
	
	
	


}
