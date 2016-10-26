import java.util.*;
public class APLab_05_1
{
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter all grades as capital letters(A,B,C,D,or F) without + or -");
		
		System.out.println("Please enter your science grade: ");
		String science = kb.next();
		System.out.println("Please enter your math grade: ");
		String math = kb.next();
		System.out.println("Please enter your ELA grade: ");
		String ELA = kb.next();
		System.out.println("Please enter your social science grade: ");
		String socialscience = kb.next();
		System.out.println("Please enter your P.E. grade: ");
		String PE = kb.next();
		System.out.println("Please enter your second language grade: ");
		String language = kb.next();
		System.out.println("Please enter your elective grade: ");
		String elective = kb.next();
		double gradepoints = calcPoints(science)+calcPoints(math)+calcPoints(ELA)+calcPoints(socialscience)+calcPoints(PE)+calcPoints(language)+calcPoints(elective);
		System.out.println("Your Grade Point Average is "+gradepoints/7);
	}

	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		else
			return 0.0;
	}
}