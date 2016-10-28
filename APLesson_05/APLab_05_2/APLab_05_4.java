import java.util.Scanner;
public class Lab_05_4
{
	static String usernames = "";
	static String passwords = "";
	public static void main(String[]args)
	{
		System.out.println("Password Program");
		passcheck();
	}
	
	public static void passcheck()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your username:");
		usernames = kb.next();
		System.out.println("Enter your password:");
		passwords = kb.next();
		security(use,pas);
	

	}
	public static void security(String use, String pas)
	{
		if(use.Equals("sahil")&&pas.Equals("sahil"))
		{
			System.out.println("Access Granted");
		}
		else if(use.Equals("sahil")&&!pas.Equals("sahil"))
		{
			System.out.println("Your password is incorrect");
			passcheck();
		}
		else if(!use.Equals("sahil")&&pas.Equals("sahil"))
		{	
			System.out.println("Your username is incorrect");	
			passcheck();
		}
		else if(!use.Equals("sahil")&&!pas.Equals("sahil"))
		{
			System.out.println("Your username and password is incorrect");
			passcheck();
		}
	
	}
	
	
	
}	