import java.util.Scanner;
public class APLab_CarDriver 
{
	public static void main(String[]args) 
	{
		Scanner kb= new Scanner(System.in);

		System.out.println("Enter paint for the car:");
		String paint = kb.nextLine();
		
		System.out.println("Enter interior for the car:");
		String interior = kb.nextLine();
		
		System.out.println("Enter the engine for the car:");
		String engine = kb.nextLine();
		
		System.out.println("Enter the tires for the car:");
		String tires = kb.nextLine();

		
		APLab_Car one = new APLab_Car(paint, interior, engine, tires);
		
		System.out.println("Paint: " + one.getPaint());
		System.out.println("Interior: " + one.getInterior());
		System.out.println("Engine: " + one.getEngine());
		System.out.println("Tires: " + one.getTire());
	}
}