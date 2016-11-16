import java.util.Scanner;
public class APLab_7_1
{
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int integer=kb.nextInt();
		int total=integer;
		int read=0;
		int sum=0;
		Tot(integer, total, read, sum);	
	}
	public static void Tot(int read, int integer, int total,int sum);
	{
		while(integer>0)
		{
			read= integer%10;
			sum= sum+read;
			integer=(integer-read)/10;
		}
		System.out.println("The sum of the digits in "+total+" is "+Tot);
	}
}