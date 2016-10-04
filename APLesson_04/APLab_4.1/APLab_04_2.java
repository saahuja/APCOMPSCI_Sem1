import java.util.Scanner;
public class APLab_04_2
{
	public static void main(String[]args)
	{

		APLab_04_2 Calculation = new APLab_04_2();
		
		
		Scanner ssloan = new Scanner(System.in);
		Scanner ssyear = new Scanner(System.in);
		System.out.println("Enter the amount you want to loan:");
		float loan = ssloan.nextFloat();
		System.out.println("For how many years?");
		float year = ssyear.nextFloat();
		float TotalCost = Calculation.Calc(loan,0.03f,12f,year);
		System.out.println("Monthly Cost: "+TotalCost);
		
		
	}
	
	public float Calc(float P,float r, float n,float t)
	{
		float a1 = 1f+r/n;
		float Power = n*t;
		float a2 = Math.round(Math.pow(a1,Power));
		float a3 = P*a2/12f;
		float Answer = a3;
		return Answer;
	}
}

