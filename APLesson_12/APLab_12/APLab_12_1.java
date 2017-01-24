
public class MilesPerHour
 {
	private int dis, h, m;
	private double mph;

	public MilesPerHour()
	{
		dis = 0;
		h = 0;
		m = 0;
		mph = 0.0;
	}

	public MilesPerHour(int distance, int hour, int min)
	{
		dis = distance;
		h = hour;
		m = min;
		mph = 0.0;
	}

	public void setValues(int distance, int hour, int min) 
	{
		dis = distance;
		h = hour;
		m = min;
		mph = 0.0;
	}

	public double getMPH() {
		mph = Math.round(dis / (h + m / 60.0));
		return mph;
	}
}