public class Lab_02
{
	public static void main(String[]args)
	{
		System.out.println("Multiplication");
		int a=25;
		int b=12;
		int product=a*b;
		System.out.println("The product of 25 and 12 is"+" "+product);
		System.out.println("                   ");
	
		System.out.println("Concatenation");
		String name="Sahil Ahuja";
		String address="13065 Caminito Bautizo";
		String city="San Diego";
		String state="CA";
		int zip=92130;
		System.out.println(name);
		System.out.println(address);
		System.out.println(city+","+ " "+state+" "+zip);
		System.out.println("                   ");
		
		
		System.out.println("Complex Calculation");
		int l=5;
		int w=5;
		int h=22;
		int SurfaceArea= 2*((l*w)+(w*h)+(h*l));
		System.out.println("The surface area of a cuboid with length=5, width=5, and height=22 is" + " "+SurfaceArea);
	}
	
	
}