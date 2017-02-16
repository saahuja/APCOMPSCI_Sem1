import java.util.ArrayList;
public class toyrunner 
{
	public static void main(String[]args) 
	{
		ArrayList<toy> toys = new ArrayList<toy>();
		toys.add(new AFigure("Cat"));
		toys.add(new Car("BMW"));
		for (toy t : toys)
			{
			System.out.println(t.toString());
			}
	}
}
