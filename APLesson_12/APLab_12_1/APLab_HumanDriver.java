import java.util.Scanner;
public class APLab_HumanDriver 
{
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("My Info..");
		APLab_Human human = new APLab_Human("black", "hazel", "brown");
		System.out.println("Hair: " + human.getHair());
		System.out.println("Eyes: " + human.getEye());
		System.out.println("Skin: " + human.getSkin());

		System.out.println("Enter the hair color:");
		String hair = kb.nextLine();
		
		System.out.println("Enter the eye color:");
		String eyes = kb.nextLine();
		
		System.out.println("Enter the skin color:");
		String skin = kb.nextLine();

		System.out.println("Friend's Info..");
		human.setHES(hair, eyes, skin);
		
		System.out.println("hair color: " + human.getHair());
		System.out.println("eye color: " + human.getEye());
		System.out.println("skin color: " + human.getSkin());
	}


}