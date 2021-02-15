package abstractdemo;

public class Circle extends Shape {
	private double radius;
	
	public Circle() {
		System.out.println("Enter the radius of the Circle");
		this.radius =sc.nextDouble();
		}

	@Override
	public double area()
	{
		return (Math.PI*radius*radius);
	}
	

}
