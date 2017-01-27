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
			String expression;
			ArrayList<String> equation = new ArrayList<>(Arrays.asList(eq.split(" ")));
			doEquation(equation);
			System.out.println(equation);

		}

		public static void doEquation(ArrayList<String> equation) 
		{
			int i=0;
			while (i<equation.size())
			{
				if (i<equation.size()&&equation.get(i).equals("+"))
				{
					equation.set(i,""+(Integer.parseInt(equation.get(i-1))+Integer.parseInt(equation.get(i+1))));
					equation.remove(i-1);
					equation.remove(i);
				}
				else if(i<equation.size()&&equation.get(i).equals("-"))
				{
					equation.set(i,""+(Integer.parseInt(equation.get(i-1))-Integer.parseInt(equation.get(i+1))));
					equation.remove(i-1);
					equation.remove(i);
				}
				else if(i<equation.size()&&equation.get(i).equals("*"))
				{
					equation.set(i,""+(Integer.parseInt(equation.get(i-1))*Integer.parseInt(equation.get(i+1))));
					equation.remove(i-1);
					equation.remove(i);
				}
				else if(i<equation.size()&&equation.get(i).equals("/"))
				{
					
					equation.set(i,""+(Integer.parseInt(equation.get(i-1))/Integer.parseInt(equation.get(i+1))));
					equation.remove(i-1);
					equation.remove(i);
				}
				else
				{
					i++;
				}
				
			}
		}
}
			
			