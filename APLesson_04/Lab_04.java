import java.util.Scanner;
public class Lab_04
{
	public static void main(String[]args)
	   {
		Lab_04 form=new Lab_04();
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
		form.format(Item1, price1);
		
		System.out.println("Please enter item 2:");
		String Item2=sItem2.next();
		System.out.println("Please enter the price");
		double price2=sprice2.nextDouble();
		form.format(Item2, price2);
		
		System.out.println("Please enter item 3:");
		String Item3=sItem3.next();
		System.out.println("Please enter the price");
		double price3=sprice3.nextDouble();
		form.format(Item3, price3);
	   }
		
		
		public void format(String word, double number)
		{
			
			System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		    System.out.printf("\n%10s .......... %10.2f", word, number );
		
		
	    }
}