package mypackage;
import java.util.*;
public class Calculator {
	 	
	private Scanner sc;
	int var1;
	int var2;
	public void calculate()
	{
		sc=new Scanner(System.in);
		System.out.println("Enter Number 1");
		var1=sc.nextInt();
		System.out.println("Enter Number 2");
		var2=sc.nextInt();
		int result=var1+var2;
		System.out.println("Result is "+result);
			
	}
	public static void main(String[] args)
	{
		Calculator c1=new Calculator();
		c1.calculate();
	}
	

}