public class APLab_Human 
{
	static String hair, eye, skin;
	public APLab_Human() 
	{
		hair = "Default";
		eye = "Default";
		skin = "Default";
	}
	public APLab_Human(String h, String e, String s)
	{
		hair = h;
		eye = e;
		skin = s;
	}
	public void setHES(String h, String e, String s) 
	{
		hair = h;
		eye = e;
		skin = s;
	}
	public String getHair() 
	{
		return hair;
	}
	public String getEye() 
	{
		return eye;
	}
	public String getSkin() 
	{
		return skin;
	}

}