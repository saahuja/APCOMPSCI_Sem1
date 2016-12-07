import java.util.Scanner;
public class APLab_9_2
{
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter 5 words:");
		String[]words=new String[5];
		for (int i=0;i<words.length;i++)
		words[i]=kb.next();
		first(words);
	}
	public static void first(String[]FirstLetter)
	{
		for(String word:FirstLetter)
		{
			String one=word.substring(0,1);
			System.out.println(one);
		}
	}
}