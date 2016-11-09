import java.util.Scanner;
public class APLab_6_8
{
	public static void main(String[]args)
	{
		sing(3,"Na");
		sing(3,"Na");
		sing(2,"Hey");
		sing(0,"Goodbye!");	
	}
	public static void sing( int integer, String lyric)
	{
		for(int i=0;i<=integer;i++)
		{
			System.out.printf(lyric+" ");
		}
		System.out.println("");
	}
}