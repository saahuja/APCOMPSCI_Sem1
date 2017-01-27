import java.util.Scanner;
public class APLab_MilesPerHourRunner
{
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the distance traveled:(miles)");
		int distance = kb.nextInt();
		System.out.println("Enter the hours:");
		int hour = kb.nextInt();
		System.out.println("Enter the minutes:");
		int min = kb.nextInt();
		APLab_MilesPerHour get = new APLab_MilesPerHour(distance, hour, min);
		System.out.println("Speed of " + distance + " miles in " + hour + " hour " + min + " minutes: " + get.getMPH() + " MPH");

		System.out.println("Enter the distance:(miles)");
		distance = kb.nextInt();
		System.out.println("Enter the hours:");
		hour = kb.nextInt();
		System.out.println("Enter the minutes:");
		min = kb.nextInt();
		APLab_MilesPerHour get = new APLab_MilesPerHour(distance, hour, min);
		System.out.println("Speed of " +distance+ " miles in " +hour+ " hour " +min+ " minutes: "+get.getMPH()+" MPH");
	}
}