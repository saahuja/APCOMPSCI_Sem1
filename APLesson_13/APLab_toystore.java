import java.util.ArrayList;
import java.util.Arrays;
public class ToyStore 
{
	ArrayList<Toy> inventory = new ArrayList<Toy>();
	String ts;

	public ToyStore() 
	{
		ts = "";
	}

	public ToyStore(String ts) 
	{
		this.ts = ts;
		loadToys();
	}
	private void loadToys()
	{
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for (int a = 0; a < toys.size(); a += 2) 
		{
			String name = toys.get(a);
			String type = toys.get(a + 1);
			Toy t;
			if (getThatToy(name) == null) 
			{
				if (type.equalsIgnoreCase("car")) 
				{
					t = new Car(name);
					inventory.add(t);
				} else if (type.equalsIgnoreCase("af")) 
				{
					t = new AFigure(name);
					inventory.add(t);
				}
			} 
			else 
			{
				t = getThatToy(name);
				t.setCount(t.getCount() + 1);
				inventory.add(t);
			}
		}
	}

	private Toy getThatToy(String name) 
	{
		for (Toy t : inventory) 
		{
			if (t.getName().equals(name))
				return t;
		}
		return null;
	}

	public String getMFToy() 
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for (Toy t : inventory)
			{
			if (max < t.getCount())
				{
				max = t.getCount();
				name = t.getName();
			}
		}
		return name;
	}

	public String getMFT() 
	{
		int cars = 0, figures = 0;
		for (Toy t : inventory) 
		{
			if (t.getType().equalsIgnoreCase("car"))
				{
					cars++;
				} 
			else 
			{
				figures++;
			}
		}
		if (cars > figures)
			return "Cars";
		else if (cars == figures)
			return "Equal Amount";
		else
			return "Action Figures";
	}

	public String toString() 
	{
		String output = "List o' Toys:\n";
		for (Toy t : inventory)
			{
				output += t.getName() + ", ";
			}
		output += "\n";
		for (Toy t : inventory) 
		{
			output += t.getName() + " " + t.getCount() + ", ";
		}
		return output;
	}
}
