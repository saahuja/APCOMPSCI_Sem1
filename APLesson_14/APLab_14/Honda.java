import java.util.Random;
import java.util.ArrayList;
public class Honda implements Location
{
	private double[]location;
	private Random rand =new Random();
	private final int ID= rand.nextInt(1000000);
	public Honda(double[]loc) 
	{
		this.location = loc;
	}
	public int getID() 
	{
		return ID;
	}
	public void move(double x, double y)
	{
		location = new double[]{x,y};
	}
	public double[]getLoc() 
	{
		return location;
	}
}