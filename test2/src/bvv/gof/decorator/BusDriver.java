package bvv.gof.decorator;

public class BusDriver extends DriverDecorator {

	public BusDriver(Driver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}

	private	void addedBehaviorOne() {
		System.out.println("I am bus driver");
	}
	public	void doit() {
		driver.doit();
		addedBehaviorOne();
	}
}
