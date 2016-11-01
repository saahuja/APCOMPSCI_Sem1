import java.util.Scanner;
public class APLab_05_4
{
	static String user = "";
	static String pass = "";
	public static void main(String[]args)
	{
		System.out.println("Password Program");
		passcheck();
	}
	
	public static void passcheck()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your username:");
		user = kb.next();
		System.out.println("Enter your password:");
		pass = kb.next();
		security(user,pass);
	

	}
	public static void security(String use, String pas)
	{
		if(use.equals("sahil")&&pas.equals("sahil"))
		{
			System.out.println("Access Granted");
		}
		else if(use.equals("sahil")&&!pas.equals("sahil"))
		{
			System.out.println("Your password is incorrect");
			passcheck();
		}
		else if(!use.equals("sahil")&&pas.equals("sahil"))
		{	
			System.out.println("Your username is incorrect");	
			passcheck();
		}
		else if(!use.equals("sahil")&&!pas.equals("sahil"))
		{
			System.out.println("Your username and password is incorrect");
			passcheck();
		}
	
	}
	
	
	
}	