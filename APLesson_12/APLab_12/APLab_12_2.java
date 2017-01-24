import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class APLab_12_1
{
		public static void main(String[] args) 
		{
		try {
			Scanner input = new Scanner(System.in);
			print("Enter the DISTANCE traveled: (in Miles)");
			int dis = input.nextInt();
			print("Enter the HOURS elapsed:");
			int hour = input.nextInt();
			print("Enter the MINUTES elapsed:");
			int min = input.nextInt();
			MilesPerHour get = new MilesPerHour(dis, hour, min);
			print("Speed of " + dis + " miles in " + hour + " hour " + min + " minutes: " + get.getMPH() + " MPH");


			print("Enter the DISTANCE traveled: (in Miles)");
			dis = input.nextInt();
			print("Enter the HOURS elapsed:");
			hour = input.nextInt();
			print("Enter the MINUTES elapsed:");
			min = input.nextInt();
			get = new MilesPerHour(dis, hour, min);
			print("Speed of " + dis + " miles in " + hour + " hour " + min + " minutes: " + get.getMPH() + " MPH");
			input.close();
		} catch (Exception e) {
			print("Did you enter the values correctly?");
		}
	}

	public static void print(String msg) {
		System.out.println(msg);
	}
}
