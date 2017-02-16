
public class Car extends Toy 
{
	private String type;

	public Car() 
	{
		super();
		this.type = "Car";
	}

	public Car(String name)
	{
		super(name);
		this.type = "Car";
	}

	public String getType()
	{
		return type;
	}
