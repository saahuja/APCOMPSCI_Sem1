import java.util.Scanner;
import java.util.Random;

public class APLab_11_6 
{
	static String[] health;
	static int HEALTHLOAD=6;
	static int healthCount;
	
	public static void main(String[]args) 
	{
		Random rand=new Random();
		Scanner kb=new Scanner(System.in);
		String turn="";
		int damage=0;
		int amount=0;
		healthCount=6;
		health=new String[HEALTHLOAD];

		while (!turn.equals("Q") && healthCount > 0)
		{
			System.out.println("Your turn! Hit Enter when ready:");
			turn=kb.next();
			if (turn.equals("Q")) 
			{
				System.out.println("Exit Game");
				return;
			}
			damage=rand.nextInt(2)+1;
			amount=rand.nextInt(6)+1;
			System.out.println(takeDamage(damage, amount));
			printClip();
		}
		System.out.println("You died!");
	}

	public static String takeDamage(int damage, int amount) 
	{
		if (damage == 1) 
		{
			healthCount -= amount;
			return "Adding "+amount+" damage";
		} 
		else 
		{
			if (healthCount+amount < HEALTHLOAD) 
			{
				healthCount += amount;
				return "Added " +amount+" health";
			} 
			else 
			{
				healthCount=HEALTHLOAD;
				return "Added "+amount+" health";
			}
		}
	}

	public static void printClip() 
	{
		String output="Health:\t";
		for (int i=0; i< HEALTHLOAD; i++) 
		{
			if (i<healthCount) 
			{
				health[i]="@";
			} 
			else 
			{
				health[i]= "[]";
			}
			output += health[i];
		}
		System.out.println(output);
	}
}