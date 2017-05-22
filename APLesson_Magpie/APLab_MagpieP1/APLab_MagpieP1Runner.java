import java.util.Scanner;
public class APLab_MagpieP1Runner
{
	public static void main(String[]args)
	{
		APLab_MagpieP1a mg = new APLab_MagpieP1a();
		
		System.out.println (mg.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equalsIgnoreCase("Bye"))
		{
			System.out.println (mg.getResponse(statement));
			statement = in.nextLine();
		}
		System.out.println ("Goodbye!");
	}

}