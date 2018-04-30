
class Color
{
	private double red;
	private double green;
	private double blue;

	public Color(double red, double green, double blue)
	{
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public double Red()
	{
		return red*255;
	}
	public double Green()
	{
		return green*255;
	}
	public double Blue()
	{
		return blue*255;
	}
}


public class Material
{
	public Color color;

	public Material(Color colour)
	{
		this.color = color;
	}
}