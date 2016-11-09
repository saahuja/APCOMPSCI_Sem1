import java.util.Scanner;

public class APLab_6_2
{
	public static void main(String[]args)
	{
	Scanner kb = new Scanner(System.in);
	System.out.println("input an integer:");
	int integer= kb.nextInt();
	for(int i=integer-1;i>=1;i--)
	{
		integer=integer*i;
	}
	System.out.println(integer);
	}
	
}