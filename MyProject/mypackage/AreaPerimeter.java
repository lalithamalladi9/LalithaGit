package mypackage;
import java.util.Scanner;
public class AreaPerimeter {
	double radius;
	double area;
	double perimeter;
	Scanner in =new Scanner(System.in);
	
    public void areaPerimeter() {
    	
    	System.out.println("Enter the radius:");
    	radius = in.nextDouble();
    	
    	area = radius *radius* (Math.PI);
    	perimeter =2*radius*(Math.PI);
    	System.out.println("The area of Circle is :"+area);
    	System.out.println("The Perimeter of Circle is :" +perimeter);
    
    }
    
    public static void main(String[] args) {
	
    	AreaPerimeter A1 =new AreaPerimeter();
    	A1.areaPerimeter();
    	}
}
