public class APLab_Car 
{
	static String paint, interior, engine, tires;
	public APLab_Car(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	public static void customBuild(String p, String i, String e, String t) 
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	public String getPaint() 
	{
		return paint;
	}
	public String getInterior()
	{
		return interior;
	}
	public String getEngine() 
	{
		return engine;
	}
	public String getTire() 
	{
		return tires;
	}
}