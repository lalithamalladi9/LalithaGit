package mypackage;

import java.util.Scanner;

public class MultiplicationTable {
	
	Scanner sc =new Scanner(System.in);
	int num1;
	int product;
	
	public void table(){
		
		System.out.println( "Enter the Number :");
		num1=sc.nextInt();
		System.out.println("The Multiplaction table of number"+num1+ "is :" );
		for(int i =1;i<=10;i++) {
			
			product = i*num1;
			System.out.println(num1 +" X " +i+" = "+ product);
		}
				
		}
		
	public static void main (String[] args) {
		
		MultiplicationTable t1= new MultiplicationTable();
		t1.table();
		
		
	}
}
	


