import java.util.Scanner;
public class APLab_InventoryDriver
 {
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		APLab_Inventory item1;
		System.out.println("Do you want to specify the category and the price? y/n");
		boolean choice = false;
			String next = kb.next();
			if (next.equals("y") || next.equals("n")) 
			{
				if (next.equals("y"))
					choice = true;
				else
					choice = false;
			} 
			else 
			{
				System.out.println("Invalid Input");
				System.out.println("Do you want to specify the Category and the Price? y/n");
			}
		kb.nextLine();
		if (choice) 
		{
			System.out.println("Enter the Manufacturer, Item Name, Category and Price:");
			String Manufacturer=kb.nextLine();String Name=kb.nextLine();String Category=kb.nextLine();int Price=kb.nextInt();
			item1 = new APLab_Inventory (Manufacturer,Name,Category,Price);
		} 
		else 
		{
			System.out.println("Enter the Manufacturer and Item Name:");
			item1 = new APLab_Inventory(kb.nextLine(), kb.nextLine());
		}
		System.out.println(item1.toString());
	}
}