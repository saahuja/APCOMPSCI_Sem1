import java.util.Scanner;
public class APLab_04C
{
	static float side = 0;
	static float surfarea = 0;
	
	public static void main(String[]args)
	{
		APLab_04C Method = new APLab_04C();
		Scanner sside = new Scanner(System.in);
		
		System.out.println("Enter the side measurment of the cube:");
		side = sside.nextFloat();
		
		Method.avg(side);
		Method.Print();
		
	}
	
	public float avg(float a)
	{
		float square = side*side;
		surfarea = square*6;
		return surfarea;
	}
	
	public void Print()
	{
		System.out.println("The Surface Area is: "+surfarea);
	}
}