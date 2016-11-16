import java.util.Scanner;
public class APLab_7_2
{
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int integer= kb.nextInt();
		int total=integer;
		int average=0;
		int read=0;
		average(read, integer, total, average);
	}
	public static void average(int read, int integer,int total, int average)
	{
		int i=0;
		while(integer>0)
		{
			read=integer%10;
			average=average+read;
			i++;
			integer=(integer-read)/10;
		}
		average=average/i;
		System.out.println("The average of the digits in "+total+" is "+average);
		
	}
		
	
}