import java.util.Scanner;
public class APLab_7_4
{
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence= kb.nextLine();
		replace(sentence);
	}
	public static String both(String a, String A)
	{
		a+=A;
		return a;
	}
	
	public static void replace(String sentence)
	{
		int replacement=0;
		String A="";
		String a="";
		while(search<sentence.length())
		{
			A=sentence.substring(replacement,replacement+1);
			if(A.equals("a"))
			{
				A="@";
			}
			a=both(a,A);
			search++;
		}
		System.out.println("The new sentence is: "+a);
	}
}