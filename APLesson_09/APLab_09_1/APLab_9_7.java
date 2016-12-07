import java.util.Scanner;
public class APLab_9_7 
{
	static String[] words;
	public static void main(String[] args) 
	{
		words = new String[5];
		fillArray();
		printArray(hasZs());
	}
	private static void printArray(String hasZs)
	{
		System.out.println("For the words:");
		for (String read:words) 
		{
			System.out.print(read+" ");
		}
		System.out.println("\nOnly "+hasZs+" contain(s) the letter z.");
	}
	private static String hasZs()
	{
		String z = "";
		for (String fullwords:words)
			{
				if (fullwords.contains("z")) 
				{
					z+=fullwords+ " ";
				}
			}
			return z;
	}
	private static void fillArray() 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 5 words:");
		for(int i=0;i<5;i++)
		{
			words[i] = kb.nextLine();
		}
	}
}