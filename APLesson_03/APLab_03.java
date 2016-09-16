import java.util.Scanner;


public class APLab_03
{
	public static void main(String[]args)
	{	//Ex_01
		Scanner keyboard= new Scanner(System.in);
		Scanner digit = new Scanner(System.in);
		Scanner fun= new Scanner(System.in);
		Scanner type=new Scanner(System.in);
		Scanner number= new Scanner(System.in);
		Scanner occupation= new Scanner(System.in);
		
		System.out.println("Hi, my name is RudeAI.");
		System.out.println("I'd like to ask you a few questions.");
		System.out.println("What is your name?");
		
		String name=keyboard.next();
		
		System.out.println(name+ "?!!! Why would anyone name a baby that?");
		System.out.println("How old are you"+" "+name+ "?");
		
		int num = digit.nextInt();
	
		System.out.println("Oooooo!!! "+num+" is getting up there.");
		System.out.println("What do you do for fun,"+" "+name+"?");
		
		String funstuff=fun.next();
		
		System.out.println("I thought only nerds like to " +funstuff+".");
		System.out.println("What kind of music to you like?");
		
		String music=type.nextLine();
		
		System.out.println("Boooo!!! I wouldn't wish the sound of "+music+" on my worst enemy.");
		System.out.println("How many siblings do you have?");
		
		int years= number.nextInt();
		
		System.out.println(years+"? Wow, I hope the rest of your family is better looking.");
		System.out.println("What do you want to be when you grow up?");
		
		String job=occupation.next();
		
		System.out.println("I think you'd have to be smarter to be a "+job+".");
		System.out.println("So "+ name+", you're " +years+"...");
		System.out.println("You like to " + funstuff+ " and listen to " +music+"...");
		System.out.println("Good luck becoming a "+ job+".");
		System.out.println("I'm only kiddin' "+ name+".");
		
		
		
		//EX_02
		Scanner height= new Scanner(System.in);
		Scanner weight=new Scanner(System.in);
		
		System.out.println("What is your height in inches?");
		int tall= height.nextInt();
		System.out.println("What is your weight in pounds?");
		int heavy= weight.nextInt();
		
		int BMI= 703*heavy/(tall*tall);
		System.out.println("Your body mass index is "+BMI+". Go eat an apple.");
		
		//EX_03
		Scanner base=new Scanner(System.in);
		Scanner octheight=new Scanner(System.in);
		Scanner octunits=new Scanner(System.in);
		
		System.out.println("Let's find the volume of an octagonal prism.");
		System.out.println("Enter a base edge:");
		int edge= base.nextInt();
		System.out.println("Enter a height:");
		int vheight=octheight.nextInt();
		System.out.println("What are the units?");
		String units=octunits.next();
		double sqrt2= Math.sqrt(2);
		double volume= 2*(1+sqrt2)*edge*edge*vheight;
		System.out.println("The volume is "+volume+" "+units+" cubed.");
		}
	
}
	
	
	
	
	
	
	
	
	
	
	
	





