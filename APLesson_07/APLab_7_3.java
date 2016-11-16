import java.util.Scanner;
public class APLab_7_3
{
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter an integer");
		int integer=kb.nextInt();
		rorder(integer);
	}
	public static void rorder(int integer)
	{
		int num=integer;
		int Num=0;
		int rev=0;
		while(integer>0)
		{
			Num=integer%10;
			integer=(integer-Num)/10;
			rev=rev*10+Num;
		}	
		System.out.println(num+" reversed is " +rev);
	}

}	