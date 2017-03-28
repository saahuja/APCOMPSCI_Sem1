public class Advance extends Ticket 
{
	private int days;

	public Advance(int D) 
	{
		days = D;
	}

	public int getPrice() 
	{
		if (days>= 10)
			{
				return 30;
			} 
		else 
			{
				return 40;
			}
	
	}
}