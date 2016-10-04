
import java.util.Scanner;
public class APLab_04_2
{
	public static void main(String[]args)
	{

		APLab_04_2 Calculation = new APLab_04_2();
		
		
		Scanner sloan = new Scanner(System.in);
		Scanner syear = new Scanner(System.in);
		System.out.println("Enter the amount you want to loan:");
		double Loan = SLoan.nextDouble();
		System.out.println("For how many years?");
		double Year = SYear.nextDouble();
		double TotalCost = Calculation.Calc(Loan,0.03,12D,Year);
		System.out.println("Monthly Cost: "+TotalCost);
		
		
	}
	
	public double Calc(double P,double r, double n,double t)
	{
		double S1 = 1D+r/n;
		double Power = n*t;
		double S2 = Math.pow(S1,Power);
		double S3 = P*S2/12D;
		double Answer = S3;
		return Answer;
	}
}

