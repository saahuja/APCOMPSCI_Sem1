import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class APLab_10_2
{
	public static void main(String[]args) 
		{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter an equation:");
		String eq= kb.nextLine();
		ArrayList<String> equation = new ArrayList<>(Arrays.asList(expression.split(" ")));

		doEquation(equation);
		System.out.println(equation);

	}

	public static void doEquation(ArrayList<String> equation) 
