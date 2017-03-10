
public class Car extends Toy {
	private String type;

	public Car() {
		super();
		this.type = "Car";
	}

	public Car(String name) {
		super(name);
		this.type = "Car";
	}

	public String getType() {
		return type;
	}

	public static void debug() {
		System.out.println("Debug");
	}

	public static void p(String msg) {
		System.out.println(msg);
	}
}
