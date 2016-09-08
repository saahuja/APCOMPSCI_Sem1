import java.util.Scanner; //import Statement

public class Lesson_03
{
	public static void main(String[]args)
	{
		//initiate the new Scaneer object "keyboard"
		Scanner keyboard= new Scanner(System.in);
		
		//prompt for user input
		System.out.println("Who is your favorite teacher");
		
		//search for the next integer that the user enters
		String teacher =keyboard.next();
		
		//print the results..
		System.out.print("Okay!" + teacher + "  "+ "is very good!");
	  
	
	
	}
	
}