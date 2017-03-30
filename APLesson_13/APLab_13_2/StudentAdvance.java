public class StudentAdvance extends Advance
 {
	 public int getPrice()
	{
		return super.getPrice()/ 2;
	}
	public StudentAdvance(int D) 
	{
		super(D);
	}
}