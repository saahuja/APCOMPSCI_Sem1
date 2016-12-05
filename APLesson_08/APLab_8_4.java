import java.util.Scanner;
public class APLab_8_4
{
	static int find=0;
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Eneter a word:");
		String word= kb.next();	
		treedeg60(word);
	}
	public static void treedeg60(String word)
	{
		find++;
		String i= "";
		if(find<=word.length()+1)
		{
			i=word.substring(0, find-1);
			System.out.printf("%10s\n",i);
			treedeg60(word);
		}
	}
}