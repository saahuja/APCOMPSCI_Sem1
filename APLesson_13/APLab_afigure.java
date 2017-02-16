
public class AFigure extends Toy
 {
	private String type;

	public AFigure() 
	{
		super();
		this.type = "ActionFigure";
	}

	public AFigure(String name) 
	{
		super(name);
		this.type = "ActionFigure";
	}

	public String getType() 
	{
		return type;
	}

 }