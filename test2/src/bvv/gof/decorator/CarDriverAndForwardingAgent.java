package bvv.gof.decorator;

public class CarDriverAndForwardingAgent extends DriverDecorator {

	public CarDriverAndForwardingAgent(Driver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}

	private	void addedBehaviorTwo() {
		System.out.println("I am a Forwarding Agent");
	}
	
	public	void doit() {
		driver.doit();
		addedBehaviorTwo();
	}
}
