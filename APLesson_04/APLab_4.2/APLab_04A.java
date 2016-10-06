import java.util.Scanner;
public class APLab_04A
{
	static float Perimeter = 0;
	static float length = 0;
	static float width = 0;
	public static void main(String[]args)
	{
		APLab_04A Method = new APLab_04A();	
		Scanner slength = new Scanner(System.in);
		Scanner swidth = new Scanner(System.in);
		System.out.println("Enter the lengh of the Rectangle:");
		length = slength.nextFloat();
		System.out.println("Enter the width of the Rectangle:");
		width = swidth.nextFloat();
		Method.perimeter(length,width);
		Method.Print();
		
	}
	public float perimeter(float length, float width)
	{
		Perimeter = 2*length+2*width;
		return Perimeter;
	}
	
	public void Print()
	{
		System.out.println("The rectangle's perimeter is: "+Perimeter);
	}
}