import java.util.Scanner;

public class APLab_DistanceRunner
 {
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the X-coordinates for the first point:");
		int x1 = kb.nextInt();

		System.out.println("Enter the Y-coordinates for the first point:");
		int y1 = kb.nextInt();

		System.out.println("Enter the X-coordinates for the second point:");
		int x2 = kb.nextInt();

		System.out.println("Enter the Y-coordinates for the second point:");
		int y2 = kb.nextInt();

		APLab_Distance get = new APLab_Distance(x1, x2, y1, y2);
		System.out.println("Distance: " + get.getDist());

		System.out.println("Enter the X-coordinates for the first point:");
		x1 = kb.nextInt();

		System.out.println("Enter the Y-coordinates for the first point:");
		y1 = kb.nextInt();

		System.out.println("Enter the X-coordinates for the second point:");
		x2 = kb.nextInt();

		System.out.println("Enter the Y-coordinates for the second point:");
		y2 = kb.nextInt();

		get = new APLab_Distance(x1, x2, y1, y2);
		System.out.println("Distance: " + get.getDist());
	}
}