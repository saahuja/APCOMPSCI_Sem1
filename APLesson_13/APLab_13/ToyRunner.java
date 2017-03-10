import java.util.ArrayList;

public class ToyRunner {
	public static void main(String[] args) {
		ArrayList<Toy> toys = new ArrayList<Toy>();
		toys.add(new AFigure("Cat"));
		toys.add(new Car("BMW"));

		for (Toy t : toys) {
			System.out.println(t.toString());
		}
	}
}
