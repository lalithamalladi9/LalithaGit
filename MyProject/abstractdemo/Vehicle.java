package abstractdemo;

public abstract class Vehicle {
	
	public Vehicle() {
			System.out.println("This is the Vehicle Class");
	}
	
	public abstract void start();
	public abstract void run();
	public abstract void stop();
	
	public void testVehicle() {
		start();
		if(true) {
			run();
			stop();
		}
	}

}
