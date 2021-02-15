package abstractdemo;

public class Truck extends Vehicle{

	@Override
	public void start() {
		System.out.println("Truck Started!");
	}

	@Override
	public void run() {
		System.out.println("Truck is running slowly!");
	}

	@Override
	public void stop() {
		System.out.println("Truck stopped.");
	}

}
