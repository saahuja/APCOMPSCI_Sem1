import java.util.Scanner;
public class APLab_6_6
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("input a word:");
		String word = kb.next();
		System.out.println("\n\n");
		for(int i=0; i<=word.length();i++)
		{
			System.out.println(word.substring (0,i));
		}
	}
}