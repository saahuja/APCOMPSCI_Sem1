import java.util.Scanner;
public class APLab_7_1
{
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int integer= kb.nextInt();
		int num=integer;
		int sumDigits = 0;
		int read = 0;
		sumDigits(read, integer, num, sumDigits);	
	}
	public static void sumDigits(int read, int integer, int num,int sumDigits)
	{
		while(integer>0)
		{
			read= integer % 10;
			sumDigits= sumDigits+read;
			integer=(integer-read)/10;
		}
		System.out.println("The sum of the digits in "+num+" is "+sumDigits);
	}
}