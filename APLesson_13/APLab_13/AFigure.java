
public class AFigure extends Toy {
	private String type;

	public AFigure() {
		super();
		this.type = "ActionFigure";
	}

	public AFigure(String name) {
		super(name);
		this.type = "ActionFigure";
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
