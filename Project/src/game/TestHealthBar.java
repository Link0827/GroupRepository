package game;

public class TestHealthBar {

	public static void main(String[] args) 
	{
		HealthBar c = new HealthBar();
		System.out.println(c.getHealth());
		c.setHealth(30);
		System.out.println(c.getHealth());
		c.addHealth(-5);
		System.out.println(c.getHealth());
		System.out.println(c);
		

	}

}
