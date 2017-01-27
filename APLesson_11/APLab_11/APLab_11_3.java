import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
public class APLab_11_3
{
	public static void main(String[]args)
	{
		Random num = new Random();
		String[][] xAndO = new String[4][4];
		for (int i=0; i< xAndO.length;i++) 
		{
			for (int j=0; j<xAndO[i].length; j++) 
			{
				int randnum= num.nextInt(2);
				if(randnum==1) 
				{
					xAndO[i][j]="O";
				}
				if (randnum==0) 
				{
					xAndO[i][j]="X";
				}
			}
		}
		for (int i=0;i<xAndO.length;i++) 
		{
			for (int j=0;j<xAndO[i].length;j++) 
			{
				System.out.print(xAndO[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}