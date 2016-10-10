import java.util.Scanner;
public class APLab_04A
{
	static float Perimeter = 0;
	static float length = 0;
	static float width = 0;
	public static void main(String[]args)
	{
		APLab_04A Method = new APLab_04A();	
		Scanner sI = new Scanner(System.in);

		System.out.println("What is the length of the Rectangle:");
		length = sI.nextFloat();
		System.out.println("What is the width of the Rectangle:");
		width = sI.nextFloat();
		Method.perimeter(length,width);
		Method.Print();
	}
	public void perimeter(float length, float width)
	{
		Perimeter = 2*length+2*width;
	}
	
	public void Print()
	{
		System.out.println("The rectangle's perimeter is: "+Perimeter);
	}
}