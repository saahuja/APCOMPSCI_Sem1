import java.util.Scanner;
public class Lab_04_1B
{
	public static void main(String[]args)
	{
		
		Lab_04_1B CVolume = new Lab_04_1B();
		
	
		Scanner SLength = new Scanner(System.in);
		Scanner SWidth = new Scanner(System.in);
		Scanner SHeight = new Scanner(System.in);
	
		System.out.println("Length?");
		double Length = SLength.nextDouble();
		
		System.out.println("Width?");
		double Width = SWidth.nextDouble();
		
		System.out.println("Height?");
		double Height = SHeight.nextDouble();
		
		double Answer = CVolume.Volume(Length,Width,Height);
		
		System.out.println("Volume in Cubic Feet: "+Answer);
	}
	
	public double Volume(double L, double W, double H)
	{
		double InchCube = L*W*H;
		double Convert = InchCube*0.000578704;
		return Convert;
	}
}