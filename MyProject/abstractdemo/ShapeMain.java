package abstractdemo;

public class ShapeMain {
	
	public static void main (String[] args) {
		
		Shape sh;
		
		System.out.println(" Calling the Rectangle Shape");
		sh= new Rectangle();
		System.out.println("The area of the rectangle is :"+sh.area());
		
		System.out.println(" Calling the Circle Shape");
		sh= new Circle();
		System.out.println("The area of the rectangle is :"+sh.area());
		
		
	}

}
