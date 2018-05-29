package agc.data;

public class VelByAxes {
	private VelValueVariance x_Axis;
	private VelValueVariance y_Axis;
	private VelValueVariance z_Axis;
	
	public VelValueVariance getX_Axis() {
		return x_Axis;
	}
	public VelValueVariance getY_Axis() {
		return y_Axis;
	}
	public VelValueVariance getZ_Axis() {
		return z_Axis;
	}

	public VelByAxes ()
	{
		this.x_Axis = new VelValueVariance ();
		this.y_Axis = new VelValueVariance ();
		this.z_Axis = new VelValueVariance ();
	}

	public VelByAxes (double xValue, double xVarianceValue, double yValue, double yVarianceValue, double zValue, double zVarianceValue)
	{
		this.x_Axis = new VelValueVariance (xValue, xVarianceValue);
		this.y_Axis = new VelValueVariance (yValue, yVarianceValue);
		this.z_Axis = new VelValueVariance (zValue, zVarianceValue);
	}
}
