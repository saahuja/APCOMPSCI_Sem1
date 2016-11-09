import java.util.Scanner;
public class APLab_6_4
{
	public static void main(String[]args)
	{
		Scanner kb= new Scanner(System.in);
		System.out.print("Enter an integer:");
		int integer= kb.nextInt();
		System.out.println("Enter the table size:");
		int table= kb.nextInt();
		System.out.printf("%5 || %5", "X", "Y");
		System.out.printf("\n%5s || %5s");
		for(int i=0;i<=table;i++)
		{
			System.out.printf("\n%5||%5d",i,i*integer);
			
		}
	}
}