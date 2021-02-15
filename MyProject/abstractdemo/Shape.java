package abstractdemo;
import java.util.*;

public abstract class Shape {
	protected Scanner sc;
	
	public Shape() 
	{
		sc= new Scanner (System.in);
	}
	
	public abstract double area();

}
