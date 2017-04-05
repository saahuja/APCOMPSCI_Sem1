public class TicketDriver 
{
	public static void main(String[]args) 
	{
		Ticket walk = new Walkup();
		Ticket advance = new Advance(10);
		Ticket stuadvance = new StudentAdvance(10);
		
		System.out.println(walk);
		System.out.println(advance);
		System.out.println(stuadvance);
	}
}
	