public class TicketDriver 
{
	public static void main(String[]args) 
	{
		Ticket walk = new Walkup();
		Ticket advance = new Advance(10);
		Ticket stuadvance = new StudentAdvance(10);
		
		System.out.println(walk.toString());
		System.out.println(advance.toString());
		System.out.println(stuadvance.toString());
	}
}
	