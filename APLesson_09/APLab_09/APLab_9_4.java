import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class APLab_9_4
{
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the size of the Fibonacci sequence:");
		int sequence= kb.nextInt();
		System.out.println("Enter the first number of the sequence:");
		int firstnum= kb.nextInt();
		System.out.println("");
		int[]Sequence=new int[sequence];
		if(sequence==0||sequence==1)
			{
				System.out.println(firstnum);		
			}
		else
			{
				Sequence[0]=0;
				System.out.println("0");
				Sequence[1]=firstnum;
				System.out.println(firstnum);
				for(int i=2;i<Sequence.length;i++)
					{
						Sequence[i]=Sequence[i-1]+Sequence[i-2];
						System.out.println(Sequence[i]);
					}
			}
	}
}