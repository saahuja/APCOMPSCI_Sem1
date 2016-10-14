import java.util.Scanner;
public class APLab_05_1
{
	public static void main(String[]args)
	{
		Scanner sitem1 = new Scanner (System.in);
		Scanner sitem2 = new Scanner (System.in);
		Scanner sitem3 = new Scanner (System.in);
		Scanner sitem4 = new Scanner (System.in);
		Scanner sprice1 = new Scanner (System.in);
		Scanner sprice2 = new Scanner (System.in);
		Scanner sprice3 = new Scanner (System.in);
		Scanner sprice4 = new Scanner (System.in);
	
		System.out.println("Please enter item 1:  ");
		String item1 = sitem1.next();
		System.out.println("Please enter the price of item 1");
		double price1 = sprice1.nextDouble();
		System.out.println("Please enter item 2:  ");
		String item2 = sitem2.next();
		System.out.println("Please enter the price of item 2");
		double price2 = sprice2.nextDouble();
		System.out.println("Please enter item 3:  ");
		String item3 = sitem3.next();
		System.out.println("Please enter the price of item 3");
		double price3 = sprice3.nextDouble();
		System.out.println("Please enter item 4:  ");
		String item4 = sitem4.next();
		System.out.println("Please enter the price of item 4");
		double price4 = sprice4.nextDouble();
		
	double subtotal= price1+price2+price3+price4
	double discount= calcdisc(subtotal)
	double tax= subtotal*0.08;
	double total=discount+tax;
	
	System.out.println("<<<<<<< receipt >>>>>>>")
	System.out.println()
	format(item1, price1)
	format(item2, price2)
	format(item3, price3)
	format(item4, price4)
	
	format("Subtoal: ", subtotal);
	
	System.out.println()
	{
		
	
	}
	
	

	
	
	
	
	
	
	
	
	
}