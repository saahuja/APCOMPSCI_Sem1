import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class APLab_11_1
{
	public static void main(String[]args)
	{
		Random num=new Random();
		int[][]nums=new int[4][4];
		
		for (int i=0; i<nums.length;i++)
		{
			for(int j=0;j<nums[i].length; j++)
			{
				int integer= num.nextInt(90)+10;
				nums[i][j]= integer;
			}
		}
		for (int i=0; i<nums.length;i++)
		{
			for (int j=0; j<nums[i].length;j++)
			{
				System.out.print(nums[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}