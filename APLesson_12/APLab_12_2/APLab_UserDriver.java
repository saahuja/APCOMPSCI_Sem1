import java.util.Scanner;
public class APLab_UserDriver
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter your first name:");
		String fni = kb.nextLine();
		System.out.println("Enter your last name:");
		String lni = kb.nextLine();

		System.out.println("Do you want a public Avatar?");
		String q = kb.nextLine();
		if (q.equalsIgnoreCase("yes")) 
		{
			System.out.println("Enter your avatar:");
			String avi = kb.nextLine();
			APLab_User st = new APLab_User(fni, lni, avi);
			System.out.println(st.toString());
		} 
		else if (q.equalsIgnoreCase("no")) 
		{
			APLab_User st = new APLab_User(fni, lni);
			System.out.println(st.toString());
		} 
		else 
		{
			System.out.println("Wrong Input");
			return;
		}

	}
}

