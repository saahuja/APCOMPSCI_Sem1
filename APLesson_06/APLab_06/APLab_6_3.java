import java.util.Scanner;

public class APLab_6_3
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("input a word:");
		String word = kb.next();
		for(int i=kb.length(); i>0; i--)
		{
				System.out.println(kb.substring(0,i));
		}
	}
}