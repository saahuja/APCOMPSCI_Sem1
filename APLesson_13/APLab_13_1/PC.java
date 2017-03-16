public class PC extends GameSystem
{
	public PC()
	{
		super("Computer");
	}
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	public String toString()
	{
		return "Platform: "+ super.getPlatform()+ "\nSerial: "+super.getSerial()+ "\nInput: "+systemInput();
		
	}	
}






