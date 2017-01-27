public class APLab_MilesPerHour 
{
	private int dis, hr, min;
	private double mph;

	public APLab_MilesPerHour() 
	{
		dis = 0;
		hr = 0;
		min = 0;
		mph = 0.0;
	}

	public APLab_MilesPerHour(int distance, int hour, int minute) 
	{
		dis = distance;
		hr = hour;
		min = min;
		mph = 0.0;
	}
	public void setValues(int distance, int hour, int minute)
	{
		dis = distance;
		hr = hour;
		min = minute;
		mph = 0.0;
	}

	public double getMPH() 
	{
		mph = Math.round(dis/(hr + min/60.0));
		return mph;
	}
}