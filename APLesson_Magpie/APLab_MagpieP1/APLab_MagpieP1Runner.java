import java.util.Scanner;
public class APLab_MagpieP1Runner
{
	public static void main(String[]args)
	{
		APLab_MagpieP1 mg = new APLab_MagpieP1();
		
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