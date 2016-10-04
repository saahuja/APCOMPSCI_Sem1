import java.util.Scanner;
public class APLab_04D
{
	static float radius = 0;
	static float area = 0;
	
	public static void main(String[]args)
	{
		Lab_04D Method = new Lab_04D();
		Scanner sradius = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle:");
		radius = sradius.nextFloat();
		
		Method.Avg(radius);
		Method.Print();
		
	}
	
	public float Avg(float a)
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