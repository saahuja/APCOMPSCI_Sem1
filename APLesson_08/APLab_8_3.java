import java.util.Scanner;
public class APLab_8_3
{
	static int find= 0;
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int integer= kb.nextInt();
		luck(integer);
		System.out.println(find);
	}
	public static void luck(int num)
	{
		if(num>0)
		{
			if(num%10 == 7)
			{
				find++;
				num=(num-7)/10;
				luck(num);
			}
			else
			{
				num=(num-(num%10))/10;
				luck(num);
			}
		}
		else
			return;
	}
}