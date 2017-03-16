public class GameRunner
 {
	public static void main(String[]args) 
	{
		GameSystem xbox =new XBox();
		GameSystem ps = new Playstation();
		GameSystem pc = new PC();

		System.out.println(xbox.toString());
		System.out.println(ps.toString());
		System.out.println(pc.toString());
	}
 }
 