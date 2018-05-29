package agc;

import agc.data.AccelerationByAxes;
import agc.data.DistByAxes;
import agc.data.FullTurnByAxes;
import agc.data.VelByAxes;
import agc.exceptions.AGCException;

public class AGCCalculator implements AgcCalculatorInterface {

	@Override
	public AccelerationByAxes CalculateMinMaxAcceleration(String InputFile, int InitialInstant, int FinalInstant)
			throws AGCException {
		// TODO Auto-generated method stub
		AccelerationByAxes result = new AccelerationByAxes();
		return result;
	}

	@Override
	public FullTurnByAxes CalculateFullTurn(String InputFile, int InitialInstant, int FinalInstant)
			throws AGCException {
		// TODO Auto-generated method stub
		
		FullTurnByAxes result = new FullTurnByAxes();
		return result;
	}
	
	@Override
	public DistByAxes CalculateDist(String InputFile, int FinalInstant)
			throws AGCException {
		// TODO Auto-generated method stub
		
		DistByAxes result = new DistByAxes();
		return result;
	}
	
	@Override
	public VelByAxes CalculateVel(String InputFile, int FinalInstant)
			throws AGCException {
		// TODO Auto-generated method stub
		
		VelByAxes result = new VelByAxes();
		return result;
	}

}
