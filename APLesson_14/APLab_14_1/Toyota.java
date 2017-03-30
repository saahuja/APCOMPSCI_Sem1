public class Toyota extends Car
 {
	public Toyota(String loc) 
	{
		int x,y; 
		String[]loc_string = loc.split(",");
		location = new double[]{Double.parseDouble(loc_string[0]),Double.parseDouble(loc_string[1])};
	}
}