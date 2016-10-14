public class APLab_05
{
	int player;
	int computer;
	
	public static void main(String[]args)
	{
		player= (Math.random()*7)+1;
		computer= (Math.random()*7)+1;
		diceroll();
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		System.out.println("The winner is" + winner);
	}
	
	public static void diceroll()
	{
		boolean winner= true;
		if(winner)
			return player;
		if(!winner)
			return computer;
	
	}
}