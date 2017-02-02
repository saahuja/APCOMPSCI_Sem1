import java.util.Random;

public class APLab_Inventory
{
	static String N, M, R;
	static long ID;
	int p;
	static Random r = new Random();

public APLab_Inventory(String manufacture, String name)
	{
		N = name;
		M = manufacture;
		R = "none";
		p = 0;
		ID = r.nextInt(100000000) + 1;
	}

	public APLab_Inventory(String manufacture, String name, String category, int price)
	{
		N = name;
		M = manufacture;
		R = category;
		p = price;
		ID = r.nextInt(100000000) + 1;
	}

	public String toString() 
	{
		return "Item Info:\n" + "Manufacturer: " + M + "\nName: " + N + "\nCategory: " + R + "\nID: " + ID
		+ "\nPrice: $" + p;
	}
}