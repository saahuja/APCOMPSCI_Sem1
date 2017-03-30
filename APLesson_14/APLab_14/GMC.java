import java.util.Random;
import java.util.ArrayList;
public class GMC implements Location
{
	private double xlocation, ylocation;
	private Random rand =new Random();
	private final int ID = rand.nextInt(1000000);
	public GMC(double x, double y)
	{
		this.xlocation = x;
		this.ylocation = y;
	}
	public int getID()
	{
		return ID;
	}
	public void move(double x, double y)
	{
		this.xlocation = x;
		this.ylocation = y;
	}
	public double[]getLoc()
	{
		return new double[]{this.xlocation,this.ylocation };
	}
}