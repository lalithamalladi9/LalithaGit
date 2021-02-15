package mypackage;

import java.util.Scanner;
public class CheckEqual {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int num1 = in .nextInt();
		System.out.println("Enter the Second number :");
		int num2 = in .nextInt();
		System.out.println("Enter the third number :");
		int num3 = in .nextInt();
		System.out.println("Enter the fourth number :");
		int num4 = in .nextInt();
		
		if((num1==num2)&& (num3==num4) && (num2==num3)) {
			
			System.out.println(" All the numbers are equal ");
		}
		
		else {
			
			System.out.println("Not Same");
		}
		
		in.close();
		
	}

}
