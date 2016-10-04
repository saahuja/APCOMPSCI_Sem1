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
		Avg(radius);
		Print();
		
	}
	
	public static float Avg(float a)
	{
		float sqrad = radius*radius;
		area = sqrad*3.14f;
		return area;
	}
	
	public void Print()
	{
		System.out.println("The area of a circle with a radius of "+radius+"is: "+area);
	}
}