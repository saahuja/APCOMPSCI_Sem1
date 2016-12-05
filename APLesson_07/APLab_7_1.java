import java.util.Scanner;
public class APLab_7_1
{
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int number= kb.nextInt();
		int sum=0;
		int num=number;
		int read=0;
		sumDigits(read, integer, total, sum);	
	}
	public static void sumDigits(int read, int integer, int total,int sum);
	{
		while(integer>0)
		{
			read= integer%10;
			sum= sum+read;
			integer=(integer-read)/10;
		}
		System.out.println("The sum of the digits in "+numberl+" is "+sum);
	}
}