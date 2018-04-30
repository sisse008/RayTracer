

public class Vector
{
	public double x;
	public double y;
	public double z;

	public Vector unitLength;

	public Vector(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;

		unitLength = UnitLength();

	}

	public double Length()
	{
		double sumOfSquares = Math.pow(x,2) + Math.pow(y, 2) + Math.pow(z, 2);
		return Math.sqrt(sumOfSquares);

	}

	private Vector UnitLength()
	{
		return new Vector(x/Length(), y/Length(), z/Length());
	}

	public Vector Plus(Vector that)
	{
		return new Vector(this.x + that.x, this.y + that.y, this.z + that.z);
	}
	public Vector Minus(Vector that)
	{
		return new Vector(this.x - that.x, this.y - that.y, this.z - that.z);
	}
	public double DotProduct(Vector that)
	{
		double sum = this.x * that.x + this.y * that.y + this.z * that.z;
		return sum;

	}

	public Vector Times(Vector that)
	{
		return new Vector(this.x*that.x, this.y*that.y, this.z*that.z);
	}

	public Vector CrossProduct(Vector that)
	{
		return new Vector(this.y*that.z - this.z*that.y, this.z*that.x - this.x*that.z, this.x*that.y - this.y*that.x);
	}
	

}