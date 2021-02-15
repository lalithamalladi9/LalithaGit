package abstractdemo;

public class Rectangle extends Shape {
	private double length;
	private double breadth;
	
	public Rectangle() {
		System.out.println("Enter the length of the Rectangle ");
		this.length =sc.nextDouble();
		System.out.println("Enter the breadth of the Rectangle ");
		this.breadth=sc.nextDouble();
	}

	@Override
	public double area()
	{
		return (length * breadth);
	}
	

}
