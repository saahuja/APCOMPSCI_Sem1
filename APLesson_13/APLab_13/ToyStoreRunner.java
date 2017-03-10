import java.util.Scanner;

public class ToyStoreRunner {
	public static void main(String[] meow) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the toy list: (Use ', ' to split)");
		String list = s.nextLine();
		ToyStore t = new ToyStore(list);
		System.out.println(t.toString());
		System.out.println("Most Frequent Type: " + t.getMFT());
		System.out.println("Most Frequent Toy: " + t.getMFToy());
		s.close();
	}
}
