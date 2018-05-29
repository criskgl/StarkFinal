package agc.data;

public class DistByAxes {
	private double dist_X;
	private double dist_Y;
	private double dist_Z;
	
	public double getDist_X() {
		return dist_X;
	}

	public double getDist_Y() {
		return dist_Y;
	}

	public double getDist_Z() {
		return dist_Z;
	}
	
	public DistByAxes ()
	{
		this.dist_X = 0.0d;
		this.dist_Y = 0.0d;
		this.dist_Z = 0.0d;
	}
	
	public DistByAxes (double xValue, double yValue, double zValue)
	{
		this.dist_X = xValue;
		this.dist_Y = yValue;
		this.dist_Z = zValue;
	}
	
}
