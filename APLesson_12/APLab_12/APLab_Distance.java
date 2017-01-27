
public class APLab_Distance 
{
	int xOne, yOne, xTwo, yTwo;
	double distance;

	public APLab_Distance() 
	{
		xOne = xTwo = yOne = yTwo = 0;
		distance = 0.0;
	}

	public APLab_Distance(int xxOne, int xxTwo, int yyOne, int yyTwo) 
	{
		xOne = xxOne;
		xTwo = xxTwo;
		yOne = yyOne;
		yTwo = yyTwo;
		distance = 0.0;
	}

	public void setValues() 
	{
		xOne = xTwo = yOne = yTwo = 0;
	}

	public double getDist() 
	{
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
		return distance;
	}
}
