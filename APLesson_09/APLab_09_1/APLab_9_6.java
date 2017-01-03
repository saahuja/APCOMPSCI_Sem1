import java.util.Scanner;
import java.util.Random;
public class APLab_9_6 
{
	static int[] array;
	public static void main(String[] args) 
	{
		array=new int[10];
		fillArray(array.length);
		printArray(getBiggest());
	}
	private static void printArray(int i) 
	{
		System.out.println("For the following numbers...");
		for (int a:array) 
		{
			System.out.print(a+" ");
		}
		System.out.println("\nIt's biggest number is");
		System.out.println(i);
	}
	private static int getBiggest() 
	{
		int i=0;
		for (int a : array) 
		{
			if (a>i) 
			{
				i=a;
			}
		}
		return i;
	}
	public static void fillArray(int j) 
	{
		Random rand = new Random();
		for (int a = 0; a < j; a++) 
		{
			array[a] = rand.nextInt(100) + 1;
		}
	}
}