
public abstract class Toy {
	private String name;
	private int count;

	public Toy() {
		this.name = "";
		this.count = 1;
	}

	public Toy(String name) {
		this.name = name;
		this.count = 1;
	}

	public abstract String getType();

	public String toString() {
		return "Toy Name: " + name + "\n" + "Toy Count: " + count + "\n" + "Toy Type: " + getType();
	}

	public String getName() {
		return this.name;
	}

	public int getCount() {
		return this.count;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public static void debug() {
		System.out.println("Debug");
	}

	public static void p(String msg) {
		System.out.println(msg);
	}
}
