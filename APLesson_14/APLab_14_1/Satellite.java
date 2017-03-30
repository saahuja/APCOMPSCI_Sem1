import java.util.ArrayList;
import java.util.Random;
public class Satellite
 {
	public static void main(String[]args) 
	{
		ArrayList<Location> locate = new ArrayList<>();
		Random rand = new Random();
		int x=rand.nextInt(100);
		int y=rand.nextInt(100);
		double[]honLoc = { 5,6 };
		locate.add(new Honda(honLoc));
		locate.add(new Toyota("8,9"));
		locate.add(new GMC(3,8));
		double[]home = { 0,0 };
		String printout = "\n\n" + "==========================" + "\nStarting locations...";
		for (Location l:locate)
		{
			printout += "\nLocation for " + ((Car)l).getID() + ": (" + getLocation(((Car)l).getLoc()) + ")";
		}
		printout += "\n\n" + "==========================" + "\nMoved locations...";
		for(Location l:locate) 
		{
			printout += "\nAfter "+((Car)l).getID()+" moved from:(" + getLocation(((Car)l).getLoc()) + ")";
			((Car)l).move(x,y);
			printout += "\nNew Location for "+((Car)l).getID() + " is: (" + getLocation(((Car)l).getLoc()) + ")";
		}
		printout += "\n\n" + "==========================" + "\nDistance from home...";
		for(Location l:locate) 
		{
			printout += "\nDistance for "+((Car)l).getID()+":(" + getDistance(((Car)l).getLoc(), home) + ")";
		}
		System.out.println(printout);
	}
	public static double getDistance(double[]car, double[]home) 
	{
		return Math.sqrt((Math.pow(car[0] - home[0], 2) + Math.pow(car[1] - home[1], 2)));
	}
	public static String getLocation(double[]loc)
	{
		return loc[0] + ", " + loc[1];
	}
 }