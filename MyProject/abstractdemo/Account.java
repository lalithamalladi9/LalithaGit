package abstractdemo;

import java.util.Scanner;

public abstract class Account {
	private int accid;
	private String customerName;
	protected double balance;
	protected Scanner sc;
	public Account()
	{
	sc=new Scanner(System.in);

	}
	
	public void accept() 
	{
		System.out.println("Enter Account id ");
		accid=sc.nextInt();
		System.out.println("Enter Customer name ");
		customerName=sc.next();
		System.out.println("Enter Intial balance ");
		balance=sc.nextDouble();
		

	}
	
	public void display()
	{
		System.out.println("Account id "+accid);
		System.out.println("Customer name "+customerName);
		System.out.println("The Initial Balance is " +balance);
	}

	abstract public void calculateInterest();

	
	
	
}
