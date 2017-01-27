import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class APLab_11_2
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		String[][] words = new String[4][4];
		for (int i=0; i< words.length; i++) 
		{
			for (int j=0; j < words[i].length; j++) 
			{
				System.out.println("Please enter a word:");
				String enter = kb.nextLine();
				words[i][j] = enter;
			}
		}
		for (int i=0; i<words.length; i++) 
		{
			for (int j=0; j<words[i].length;j++) 
			{
				System.out.print(words[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}

	
