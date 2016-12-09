import java.util.Scanner;
import java.util.Random;
public class APLab_9_5
{
	static int[]Array;
	public static void main(String[]args)
	{	
		Array=new int [10];
		fillArray(Array.length);
		printArray(getOdds());
	}
	private static void printArray(String Odds)
	{
		System.out.println("For the folloowing numbers...");
		for(int i:Array)
		{
			System.out.println(i+" ");
		}
		System.out.println("These are the odds:");
		System.out.println(Odds);
	}
	private static String getOdds()
	{
		String Odds ="";
		for(int i:Array)
			{
				if(i%2==1)
				{
					Odds+=i+" ";
				}
			}
		return Odds;
	}
	public static void fillArray(int j)
	{
		Random num= new Random();
		for (int i=0;i<j;i++)
		{
			Array[i]=num.nextInt(100)+1;
		}
	}
}