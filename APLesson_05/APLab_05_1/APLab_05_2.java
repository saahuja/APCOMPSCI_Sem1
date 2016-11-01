import java.util.Scanner;
public class APLab_05_2
{
	public static void main(String[]args)
	{
		Scanner sheight = new Scanner(System.in);
		Scanner sweight = new Scanner(System.in);
		System.out.println("Enter your height in inches");
		float height = sheight.nextFloat();
		System.out.println("Enter your weight in pounds");
		float weight = sweight.nextFloat();
		float BMI = 703*weight/height/height;
		System.out.println("Your BMI is "+BMI);
		System.out.println("Your condition is "+Calc(BMI));
	}
		
	public static String Calc(float bmi)
	{
		if(bmi<18.5f)
			return "Underweight";
		else if(bmi<24.9f && bmi>18.5f)
			return "Normal";
		else if(bmi>24.9f && bmi<29.9f)
			return "Overweight";
		else if(bmi>24.9f && bmi<29.9f)
			return "Overweight";
		else if(bmi>29.9f && bmi<39.9f)
			return "Obese";
		else if(bmi>39.9f)
			return "Morbidly Obese";
		else
			return "Error";
	}
}
