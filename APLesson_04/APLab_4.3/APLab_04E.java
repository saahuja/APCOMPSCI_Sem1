import java.util.Scanner;
public class APLab_04E
{
	static float Perimeter = 0;
	static float length = 0;
	static float width = 0;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter the lengh of the Rectangle:");
		length = kb.nextFloat();
		System.out.println("Enter the width of the Rectangle:");
		width = kb.nextFloat();
		
		Print(perimeter(length,width));
		
	}
	public static float perimeter(float length, float width)
	{
		Perimeter = 2*length+2*width;
		return Perimeter;
	}
	