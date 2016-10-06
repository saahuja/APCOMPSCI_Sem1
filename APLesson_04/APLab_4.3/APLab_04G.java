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
		avg(side);
		Print();
		
	}
	
	public static float avg(float a)
	{
		float square = side*side;
		surfarea = square*6;
		return surfarea;
	}
	
	public static void Print()
	{
		System.out.println("The Surface Area is: "+surfarea);
	}
}