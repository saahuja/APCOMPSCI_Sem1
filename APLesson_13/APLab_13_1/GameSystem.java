import java.util.Scanner; 
import java.util.Random;                                       
	public abstract class GameSystem
	{
		private int serialNo;
		private String platform;
		public GameSystem(String p)
		{
			this.platform=p;
			Random R= new Random();
			this.serialNo=R.nextInt(10000000);
		}
		public String getPlatform() 
		{
			return this.platform;
		}
		public int getSerial() 
		{
			return this.serialNo;
		}	
	}
	
	
	
	
	
	

