import java.util.Scanner;
public class APLab_9_3
{
	public static void main(String[]args)
	{
		int[] randomnum= new int[10];
		for(int i=0;i<randomnum.length;i++)
			randomnum[i]=(int)(Math.random()*100)+1;
		for(int print:randomnum)
			System.out.println(print+"");
		average(randomnum);
	}
	public static void average(int[]Numbers)
	{
		int Total=0;
		for(int add:Numbers)
		{
			Total+=add;
		}
		System.out.println("Average is:" + Total/10);
	}
}