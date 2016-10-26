import java.util.Scanner;
public class Lab_05_4
{
	static String Usernames = "";
	static String Passwords = "";
	public static void main(String[]args)
	{
		System.out.println("[Password Gateway]");
		CheckPass();
	}
	
	public static void CheckPass()
	{
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter your USERNAME:");
		Usernames = Input.next();
		System.out.println("Enter your PASSWORD:");
		Passwords = Input.next();
		PassCheck(Usernames,Passwords);
	}
	

	}