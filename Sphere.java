



public class Sphere
{
	private Point center;
	private double radius;

	public Sphere(Point center, double radius)
	{
		this.radius = radius;
		this.center = center;
	}

	public Point Center()
	{
		return center;
	}

	public double Radius()
	{
		return radius;
	}

}