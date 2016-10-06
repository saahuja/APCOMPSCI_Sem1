import java.util.Scanner;
public class APLab_04_3
{
	public static void main(String[]args)
	{
		
		APLab_04_3 calcvolume= new APLab_04_3();
		Scanner slength = new Scanner(System.in);
		Scanner swidth = new Scanner(System.in);
		Scanner sheight = new Scanner(System.in);
	
		System.out.println("Enter the length of the subwoofer box:");
		double length = slength.nextDouble();
		
		System.out.println("Enter the width of the subwoofer box");
		double width = swidth.nextDouble();
		
		System.out.println("Enter the height of the subwoofer box");
		double height = sheight.nextDouble();
		
		double product = conversion.calcvolume(length,height, width);
		System.out.println("Your volume in cubic feet: "+product);
	}
	
	public double calcvolume(double l, double h, double w);
	{
		double volumeinches = l*h*w;
		double conversion= volumeinches*0.000578704;
		return conversion;
	}
}