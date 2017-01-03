import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class APLab_11_1
{
	public static void main(String[]args)
	{
		Random rand=new Random();
		int[][]nums=new int[4][4];
		
		for (int i=0; i<nums.length;i++)
		{
			for(int j=0;j<nums[i].length; i++)
			{
				int integer= rand.nextInt(90)+10;
				nums[i][j]= integer;
			}
		}
		for (int i=0; i<nums.length;i++)
		{
			for (int j=0; j<nums[i].length;i++)
			{
				System.out.print(nums[i][j]+"");
			}
			System.out.println("");
		}
	}
}