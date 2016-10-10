import java.util.Scanner;
public class APLab_04C
{
	static float side = 0;
	static float surfacearea = 0;
	
	public static void main(String[]args)
	{
		APLab_04C method = new APLab_04C();
		Scanner sside = new Scanner(System.in);
		System.out.println("Enter the side measurement of the cube:");
		side = sside.nextFloat();
		method.Print(method.mside(side));
	}
	
	public float mside(float a)
	{
		float square = side*side;
		surfacearea = square*6;
		return surfacearea;
	}
	
	public void Print(float A)
	{
		System.out.println("The surface area is: "+A);
	}
}