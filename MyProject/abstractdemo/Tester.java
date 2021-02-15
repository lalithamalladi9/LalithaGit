package abstractdemo;

public class Tester {

	public static void main(String[] args) {
		
		Vehicle car=new Car();
		testVehicle(car);
		
		Vehicle truck = new Truck();
		testVehicle(truck);
		
	}

	public static void testVehicle(Vehicle v) {
		v.testVehicle();
	
	}

}
