public class Point implements shape
{
	protected int x,y;
	public Point()
	{
		setPoint(0,0);
	}
	public Point(int a,int b)
	{
		setPoint(a,b);
	}
	public void setPoint(int a,int b)
	{
		x=a;
		y=b;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public String toString()
	{
		return "["+x+","+y+"]";
	}
	public double area(){return 0.0;}
	public double volume(){return 0.0;}
	public String getName()
	{
		return "Point";
	}
}











