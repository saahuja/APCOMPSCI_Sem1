import java.util.Scanner;
public class APLab_8_2
{
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter a word:");
		String word1=kb.next();
		System.out.println("Enter a second word");
		String word2=kb.next();
		System.out.println("Enter a third word");
		String word3=kb.next();
		makeCenter(word1);
		makeCenter(word2);
		makeCenter(word3);
	}
	public static void makeCenter(String word)
	{
		if(word.length()>20)
		{
			System.out.println(word);
			return;
		}
		else
		{
			word=" "+word+" ";
			makeCenter(word);
		}
	}
}