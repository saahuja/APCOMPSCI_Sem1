import java.util.Scanner;
public class APLab_04
{ 
	public static void main(String[]args)
	   {
		APLab_04 form=new APLab_04();
	
		Scanner sItem1 = new Scanner(System.in);
		Scanner sItem2= new Scanner(System.in);
		Scanner sItem3= new Scanner(System.in);
		Scanner sprice1= new Scanner(System.in);
		Scanner sprice2= new Scanner(System.in);
		Scanner sprice3= new Scanner(System.in);
	
		System.out.println("Please enter item 1:");	
		String Item1=sItem1.next();
		System.out.println("Please enter the price");
		double price1=sprice1.nextDouble();
	
		
		System.out.println("Please enter item 2:");
		String Item2=sItem2.next();
		System.out.println("Please enter the price");
		double price2=sprice2.nextDouble();

		
		System.out.println("Please enter item 3:");
		String Item3=sItem3.next();
		System.out.println("Please enter the price");
		double price3=sprice3.nextDouble();
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		form.format(Item1, price1);
		form.format(Item2, price2);
		form.format(Item3, price3);
		
		double subtotal= price1+price2+price3;
		double tax= subtotal*0.08;
		double total= tax+subtotal;
		
		System.out.println("");
		
		form.format("Sub-Total",subtotal);
		form.format("Tax",tax);
		form.format("Total",total);
			
		System.out.println("\n   -----------------------------------");
		
	   }
		
		
		public void format(String Item, double IPrice)
		{
		    System.out.printf("\n%10s .......... %10.2f", Item, IPrice );
	    }
}