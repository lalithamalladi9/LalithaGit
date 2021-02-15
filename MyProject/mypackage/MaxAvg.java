package mypackage;
import java.util.Scanner;

public class MaxAvg {
	int var1;
	int var2;
	public void accept()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the var1 ");
		this.var1=sc.nextInt();
		System.out.println("Enter the var2");
		this.var2=sc.nextInt();
		sc.close();
	}
	public void display()
	{
		int avg = (var1+var2)/2;
		System.out.println("The  Avg value is "+avg);
		if(var1>var2)
		{
			System.out.println("The  Max value is "+var1);
		}
		else
			System.out.println("The Max Value is "+var2 );
	}
	public static void main(String args[])
	{
			MaxAvg a1 = new MaxAvg();
			a1.accept();
			a1.display();
	}
	}