public class APLab_05_1
{
	public static void main(String[]args)
	{
		scanner kb=new Scanner(System.in);
		System.out.println("Enter all grades as capital letters(A,B,C,D,or F) without + or -");
		
		System.out.println("Please enter your science grade: ");
		System.out.println("Please enter your math grade: ");
		System.out.println("Please enter your ELA grade: ");
		System.out.println("Please enter your social science grade: ");
		System.out.println("Please enter your P.E. grade: ");
		System.out.println("Please enter your second language grade: ");
		System.out.println("Please enter your elective grade: ");
		double  gradepoints = calcPoints(science)+calcPoints(math)+calcPoints(ELA)+calcPoints(social science)+calcPoints(PE)+calcPoints(language)+calcPoints(elective);
		System.out.println("Your Grade Point Average is "+gradepoints/7);
		
		String grade = calcPoints(science,math,ELA,social science,PE,language,elective);
	}
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
		if (grade.equals("F"))
			return 0.0;