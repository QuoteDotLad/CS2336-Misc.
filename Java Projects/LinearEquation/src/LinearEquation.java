class LinearEquation
{
	double a, b, c, d, e, f;
	LinearEquation(double a, double b, double c, double d, double e, double f) //Non default constructor
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	//Accessors
	public double getA()
	{
		return a;
	}
	public double getB()
	{
		return b;
	}
	public double getC()
	{
		return c;
	}
	public double getD()
	{
		return d;
	}
	public double getE()
	{
		return e;
	}
	public double getF()
	{
		return f;
	}
	public boolean isSolvable() //Sees if denominator is 0 or not
	{
		double denom = ((a*d) - (b*c));
		if(denom != 0) return true;
		else return false;
	}
	public double getX() //Gets the linear equations, assuming that the denominator will not be 0
	{
		double x = (((e*d) - (b*f))/((a*d)-(b*c)));
		return x;
	}
	public double getY()
	{
		double y = (((a*f) - (e*c))/((a*d)-(b*c)));
		return y;
	}
}
