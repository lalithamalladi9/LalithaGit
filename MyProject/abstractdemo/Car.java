package abstractdemo;

public class Car extends Vehicle {

	@Override
	public void start() {
		System.out.println("The Car Started!");
		
	}

	@Override
	public void run() {
		System.out.println("Car is Running fast!");
	}

	@Override
	public void stop() {
		System.out.println("Car is stopping slowly.");
		
	}

}
