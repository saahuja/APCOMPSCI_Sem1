import java.util.Scanner;
public class APLab_04G
{
	static float side = 0;
	static float surfarea = 0;
	
	public static void main(String[]args)
	{
		
		Scanner sside = new Scanner(System.in);
		System.out.println("Enter the side measurment of the cube:");
		side = sside.nextFloat();
		
		Print(avg(side));
		
	}
	
	public static float avg(float a)
	{
		float square = side*side;
		surfarea = square*6;
		return surfarea;
	}
	
	public static void Print(float a)
	{
		System.out.println("The Surface Area is: "+a);
	}
}