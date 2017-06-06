import java.util.Scanner;

public class APLab_MagpieP2Runner
{
	public static void main(String[] args)
	{
		APLab_MagpieP2 maggie = new APLab_MagpieP2();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equalsIgnoreCase("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
		System.out.println ("Goodbye!");
	}

}