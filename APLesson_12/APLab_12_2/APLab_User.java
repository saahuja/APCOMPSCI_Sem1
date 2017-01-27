import java.util.Random;
public class APLab_User 
{
	static String fn, ln, av;
	static long id;
	static Random rand = new Random();

	public APLab_User() 
	{
		ID = rand.nextInt(10000000) + 1;
	}

	public APLab_Stuff(String fni, String lni) 
	{
		fn = fni;
		ln = lni;
		av = "None";
		id = r.nextInt(10000000) + 1;
	}

	public APLab_Stuff(String fni, String lni, String avi) 
	{
		fn = fni;
		ln = lni;
		av = avi;
		id = r.nextInt(10000000) + 1;
	}

	public String getFN()
	{
		return fn;
	}

	public String getLN() 
	{
		return ln;
	}

	public String getAV()
	{
		return av;
	}

	public long getID() 
	{
		return id;
	}

	public String toString() 
	{
		return "Customer Info:\n" + "First Name: " + fn + "\nLast Name: " + ln + "\nAvatar: " + av + "\nID: " + id;
	}
}