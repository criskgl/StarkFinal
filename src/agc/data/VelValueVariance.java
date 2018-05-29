package agc.data;

public class VelValueVariance {
	double velValue;
	double variance;
		
	public double getVelValue() {
		return velValue;
	}
	
	public double getVariance() {
		return variance;
	}

	public VelValueVariance ()
	{
		this.velValue = 0.0d;
		this.variance = 0.0d;
	}
	
	public VelValueVariance (double velValue, double variance)
	{
		this.velValue = velValue;
		this.variance = variance;
	}
	
}
