import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
public class APLab_11_4 
{
	public static void main(String[]args) 
	{
		Scanner kb=new Scanner(System.in);
		Random num=new Random();
		int[][] nums = new int[4][4];

		for (int i=0; i<nums.length;i++) 
		{
			for (int j=0;j<nums[i].length;j++) 
			{
				int randnum=num.nextInt(100)+1;
				nums[i][j]=randnum;
				System.out.print(nums[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("Enter a number:");
		int divisor = kb.nextInt();
		if (divisor == 0) 
		{
			System.out.println("Cannot divide by 0");
			return;
		}
		int count = 0;
		for (int i=0; i<nums.length;i++) 
		{
			for (int j=0; j<nums[i].length;j++) 
			{
				if (nums[i][j]%divisor==0) 
				{
					count++;
				}
			}
		}
		System.out.println("There are "+count+" numbers divisible by "+divisor+" in the Array.");
	}
}