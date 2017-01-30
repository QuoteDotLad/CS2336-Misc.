class RegularPolygon
	{
		private int n;
		private double side;
		private double x;
		private double y ;
		RegularPolygon() //Default constructor
		{
			n = 3;
			side = 1;
			x = 0;
			y = 0;
		}
		RegularPolygon(int n, double length) //Non-Default constructor
		{
			this.n = n;
			side = length;
		}
		public RegularPolygon(int n, double length, double x, double y)
		{
			this.n = n;
			side = length;
			this.x = x;
			this.y = y;
		}
		//Accessors
		public void setN(int n) 
		{
			this.n=n;
		}
	    public void setSide(double side)
	    {
	    	this.side=side;
	    }
	    public void setX(int x)
	    {
	    	this.x=x;
	    }
	    public void setY(int y)
	    {
	    	this.y=y;
	    }
	    //Mutators
	    public int getN()
	    {
	    	return n;
	    }
	    public double getSide()
	    {
	    	return side;
	    }
	    public double getX()
	    {
	    	return x;
	    }
	    public double getY()
	    {
	    	return y;
	    }
	    public double getPerimeter()
	    {
	    	return side * n;
	    }
	    public double getArea()
	    {
	    	return (side*side*n)/(4*Math.tan(Math.PI/n));
	    }
}