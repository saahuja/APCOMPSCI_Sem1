import java.util.Scanner;
public class APLab_04A
{
	static float perimeter = 0;
	static float length = 0;
	static float width = 0;
	public static void main(String[]args)
	{
		APLab_04A Method = new APLab_04A();	
		Scanner slength = new Scanner(System.in);
		Scanner swidth = new Scanner(System.in);
		
		System.out.println("Enter the lengh of the Rectangle:");
		length = slength.nextfloat();
		System.out.println("Enter the width of the Rectangle:");
		width = ssidth.nextfloat();
		
		Method.Perimeter(length,width);
		Method.Print();
		
	}
	
	
	
	public float Perimeter(float length, float width)
	{
		Perimeter = length+length+width+width;
		return Perimeter;
	}
	
	public void Print()
	{
		System.out.println("The rectangle's perimeter is: "+Perimeter);
	}
}