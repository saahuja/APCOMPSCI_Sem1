import java.util.Scanner;
public class APLab_04_3
{
	public static void main(String[]args)
	{
		APLab_04_3 calcvolume = new APLab_04_3();
		Scanner sInput = new Scanner(System.in);
	
		System.out.println("Enter the length of the subwoofer box:");
		double length = sInput.nextDouble();
		
		System.out.println("Enter the width of the subwoofer box");
		double width = sInput.nextDouble();
		
		System.out.println("Enter the height of the subwoofer box");
		double height = sInput.nextDouble();
		
		double product = calcvolume.vol(length,height,width);
		System.out.println("Your volume in cubic feet: "+product);
	}
	
	public double vol(double l, double h, double w)
	{
		double volumeinches = l*h*w;
		double conversion= volumeinches*0.0005787D;
		return conversion;
	}
}