import java.util.Scanner;
public class APLab_6_5
{
	public static void main(String[]args)
	{ 
		Scanner kb= new Scanner(System.in);
		System.out.println("Enter a value you want to count to:");
		int value= kb.nextInt();
		System.out.println("Enter the factor you want to count by:");
		int factor= kb.nextInt();
		System.out.print("\n\n");
		for(int i=0; i<=value;i=i+factor)
		{
			System.out.println(i);
		}
	}
}
