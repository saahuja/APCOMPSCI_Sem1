import java.util.Scanner;
public class APLab_04B
{
	static float num1 = 0;
	static float num2 = 0;
	static float num3 = 0;
	static float average = 0;

	
	public static void main(String[]args)
	{
		APLab_04B method = new APLab_04B();
		Scanner snum1 = new Scanner(System.in);
		Scanner snum2 = new Scanner(System.in);
		Scanner snum3 = new Scanner(System.in);
		
		System.out.println("Enter Number 1:");
		num1 = snum1.nextFloat();
		System.out.println("Enter Number 2:");
		num2 = snum2.nextFloat();
		System.out.println("Enter Number 3:");
		num3 = snum3.nextFloat();
		
		method.value(num1, num2, num3);
		method.Print();
		
	}
	
	public float value(float a, float b, float c)
	{
		float sum = num1+num2+num3;
	    average = sum/3;
		return average;
	}
	
	public void Print()
	{
		System.out.println("The average of the three numbers is: "+ average);
	}
}