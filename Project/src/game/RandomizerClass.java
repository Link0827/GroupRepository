package game;

import java.util.*;

public class RandomizerClass
{

	public static Random theInstance = null;
	
	public static Random getInstance()
	{
		if (theInstance == null)
		{
			theInstance = new Random();
		}
		return theInstance;
	}
	
	public static boolean nextBoolean()
	{
		return RandomizerClass.getInstance().nextBoolean();
	}

	public static boolean nextBoolean(double probability)
	{
		return RandomizerClass.nextDouble() < probability;
	}
	
	public static int nextInt(){
		return RandomizerClass.getInstance().nextInt();
	}

	public static int nextInt(int n)
	{
		return RandomizerClass.getInstance().nextInt(n);
	}

	/* Return a number between min and max, inclusive. */
	public static int nextInt(int min, int max)
	{
		return min + RandomizerClass.nextInt(max - min + 1);
	}

	public static double nextDouble()
	{
		return RandomizerClass.getInstance().nextDouble();
	}

	public static double nextDouble(double min, double max)
	{
		return min + (max - min) * RandomizerClass.nextDouble();
	}

	
}
