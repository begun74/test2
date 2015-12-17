package bvv.gof.decorator;

public class DriverDecorator extends Driver {

	protected Driver driver;
	
	public DriverDecorator(Driver dr)
	{
		driver=dr;
	}
	
	@Override
	public void doit() {
			driver.doit();
	}

}
