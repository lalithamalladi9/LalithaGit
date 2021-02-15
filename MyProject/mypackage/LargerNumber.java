package mypackage;

import java.util.Scanner;
public class LargerNumber {
	
	public static void Main(String args[])
	{
	
		int x;
		int y;
		//int rem;
	
		Scanner in = new Scanner( System.in);
		System.out.println("Enter the First Number ");
		x=in.nextInt();
		System.out.println("Enter the Second Number ");
		y=in.nextInt();
		in.close();
		
		if(x==y) 
		{
			System.out.println("0");
		}
		else if(x>y)
		{
			System.out.println("The First number is larger");
		}
		else if(y>x)
		{
			System.out.println("The Second number is larger");
		}
		
	}		

}
