import java.util.Scanner;
public class APLab_9_5
{
	static int[] array;
	public static void main(String[]args)
	{	
		array=new int [10];
		fillArray(array.length);
		printArray(getOdds());
	}
	private static void printArray(String Odds)
	{
		System.out.println("Original Array");
		for(int i:array)
		{
			System.out.println(i+"");
		}
		System.out.println("Odds");
		System.out.println(Odds);
	}
	private static String getOdds()
	{
		String Odds ="";
		for(int i:array)
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
			array[i]=num.nextInt(100)+1;
		}
	}
}