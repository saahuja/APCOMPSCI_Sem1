public class GameRunner
 {
	public static void main(String[]args) 
	{
		GameSystem pc = new PC();
		GameSystem xbox =new XBox();
		GameSystem playstation = new Playstation();
		

		System.out.println(xbox);
		System.out.println(playstation);
		System.out.println(pc);
	}
 }
 