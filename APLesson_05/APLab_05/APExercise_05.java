public class APExercise_05
{
	
	static int player;
	static int computer;
	static String winner;
	
	public static void main(String[]args)
	{
		player= (int)(Math.random()*6)+1;
		computer= (int)(Math.random()*6)+1;
		diceroll();
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		System.out.println("The winner is " + winner);
	}
	
	public static void diceroll()
	{
		if (player > computer)
			winner = "Player";
		if (computer > player)
			winner = "Computer";
		if (player == computer)
			winner = "It's a tie";
	
	}
}