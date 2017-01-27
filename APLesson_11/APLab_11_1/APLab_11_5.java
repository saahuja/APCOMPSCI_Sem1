import java.util.Scanner;
public class APLab_11_5
{
	static int bulletCount;
	static int CLIPSIZE = 16;
	static int shotCount;
	static String[] clip;

	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		bulletCount = 96;
		shotCount = 0;
		clip = new String[CLIPSIZE];
		resetClip();
		while (bulletCount>0) 
		{
			while (shotCount >= 0) 
			{
				System.out.println("Action:");
				String action = kb.next();
				if (action.equals("R")) 
				{
					reload();
				} 
				else if (action.equals("S")) 
				{
					System.out.println(shoot());
				}
				printClip();
			}
		}
		System.out.println("Out of Bullets!");
	}
	
	
	public static void resetClip() 
	{	
		bulletCount=96;
		for (int i=0; i<clip.length; i++) 
		{
			clip[i] = "[]";
		}
	}
	
	public static String shoot() 
	{
		if (shotCount>0) 
		{
			clip[shotCount - 1] = "[]";
			shotCount--;
			return "Boom!!!";
		}
		return "Reload!!!";
	}

	public static void reload() 
	{
		if (bulletCount >= CLIPSIZE) 
		{
			bulletCount -= CLIPSIZE;
			shotCount = CLIPSIZE;
			for (int i=0; i<shotCount;i++) 
			{
				clip[i]="*";
			}
		} 
		else 
		{
			shotCount = bulletCount;
			bulletCount = 0;
			resetClip();
			for (int i=0; i<shotCount;i++) 
			{
				clip[i] = "*";
			}
		}
	}


	public static void printClip() 
	{
		String total = "";
		total += "Bullets Stored:\t" + bulletCount + "\nClip:\t";
		for (int i=0; i<CLIPSIZE; i++)
		{
			total += clip[i];
		}
		System.out.println(total);
	}
}