import java.util.*;
public class Car implements Location
 {
	public double[]location;
	private Random rand =new Random();
	private final int ID = rand.nextInt(1000000);
	
	public Car() 
	{
		location=new double[2];
	}
	public int getID()
	{
		return ID;
	}
	public void move(int x, int y)
	{
		location = new double[]{ x, y };
	}
	public double[]getLoc() 
	{
		return location;
	}
}

