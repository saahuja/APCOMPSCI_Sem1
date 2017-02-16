public abstract class toy
 {
	private String name;
	private int count;

	public toy() 
	{
		this.name = "";
		this.count = 1;
	}
	public toy(String name)
	{
		this.name = name;
		this.count = 1;
	}
	public abstract String getType();
	public String toString() 
	{
		return "Toy Name: " + name + "\n" + "Toy Count: " + count + "\n" + "Toy Type: " + getType();
	}
	public String getName()
	{
		return this.name;
	}
	public int getCount() 
	{
		return this.count;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setCount(int count)
	{
		this.count = count;
	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
