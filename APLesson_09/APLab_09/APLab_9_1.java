import java.util.Scanner;
public class APLab_9_1
{
	public static void main(String[]args)
	{
		Scanner kb= new Scanner(System.in);
		System.out.println("Enter 5 words");
		String[]words= new String[5];
		for(int i=0;i<words.length;i++)
		words[i]=kb.next();
		System.out.println("In order...");
		for(int i=0;i<words.length;i++)
		System.out.println(words[i]);
		System.out.println("Reversed...");
		for(int i=words.length-1;i>=0;i--)
		System.out.println(words[i]);
	}				
}

