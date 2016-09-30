
import java.util.Scanner;
public class APLab_04_1
{
	public static void main(String[]args)
	{
		
		APLab_04_1 form = new APLab_04_1();
		
		Scanner sfirstname = new Scanner(System.in);
		Scanner slastname = new Scanner(System.in);
		Scanner stitle = new Scanner(System.in);
		Scanner sschool= new Scanner(System.in);
		Scanner syear = new Scanner(System.in);
		Scanner ssubject = new Scanner(System.in);
		
		
		
		System.out.println("Enter your first name:");
		String FirstName = sfirstname.nextLine();
		System.out.println("Enter your last name:");
		String LastName = slastname.nextLine();
		System.out.println("Enter your title:");
		String Title = stitle.nextLine();
		System.out.println("Enter the school name:");
		String School = sschool.nextLine();
		System.out.println("Enter the school year:");
		String Year = syear.nextLine();
		System.out.println("What is your subject?");
		String Subject = ssubject.nextLine();
		System.out.print("******************************");
		form.format(FirstName,LastName);	
		form.format(Title,School);	
		form.format(Year,Subject);	
		System.out.println("\n******************************");
	}
	

	
	public void format(String Name1, String Name2)
	{
		System.out.printf("\n* %10s\t%12s *",Name1, Name2);
	}
}
