package mypackage;

import java.util.Scanner;

public class Product {
	
	Scanner sc =new Scanner(System.in);
	int var1;
	int var2;
	public void product()
	{
		
		System.out.println("Enter Number 1");
		var1=sc.nextInt();
		System.out.println("Enter Number 2");
		var2=sc.nextInt();
		int result=var1*var2;
		System.out.println("Result is "+result);
			
	}
	public static void main(String[] args)
	{
		Product p1=new Product();
		p1.product();
	}
	

}
