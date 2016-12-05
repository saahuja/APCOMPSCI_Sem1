import java.util.Scanner;
public class APLab_8_1
{
	static String nsentence="";
	static int Replace=0;
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence=kb.nextLine();
		replace(sentence);
	}
	public static void replace(String sentence)
	{
		Replace++;
		String i= " ";
		if(Replace<=sentence.length())
		{
			i=sentence.substring(Replace-1, Replace);
			if(i.equals(" "))
			{
				i="_";
			}
		nsentence += i;
		replace(sentence);
		}
		else
			System.out.println("New sentence: "+ nsentence);
	}		
}