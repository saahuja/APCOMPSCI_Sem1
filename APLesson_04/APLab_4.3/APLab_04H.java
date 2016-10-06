import java.util.Scanner;
public class APLab_04H
{
	static float radius = 0;
	static float area = 0;
	
	public static void main(String[]args)
	{
		Scanner sradius = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		radius = sradius.nextFloat();
		Value(radius);
		Print();
		
	}
	public static float Value(float a)
	{
		float sqrad = radius*radius;
		area = sqrad*3.141f;
		return area;
	}
	
	public static void Print()
	{
		System.out.println("The area of a circle with a radius of "+radius+ " is "+area);
	}
}