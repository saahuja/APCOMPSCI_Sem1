import java.util.Random;
import java.util.ArrayList;
public class Toyota implements Location
{  
	private double[]location;
	private Random rand =new Random();
	private final int ID = rand.nextInt(1000000);
	public Toyota(String loc) 
	{
		String[]loc_string = loc.split(",");
		this.location = new double[]{Double.parseDouble(loc_string[0]),Double.parseDouble(loc_string[1])};
	}
	public int getID() 
	{
		return ID;
	}
	public double[]getLoc() 
	{
		return location;
	}
	public void move(double x, double y) 
	{
		this.location = new double[]{x,y};
	}
	
}