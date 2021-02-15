package mypackage;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		int x, y, temp =0 ;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number X :" );
		x= in.nextInt();
		System.out.println("Enter the number Y :" );
		y= in.nextInt();
		in.close();	
		temp =x;
		x=y;
		y=temp;
		
		System.out.println(" The number after Swap are : "+ "X is :" + x + " Y is : " +y);
		
		
	}

}
