package mydemo;
import java.util.*;

public class BankAccount {
	private int accountNumber;
	private double totalBalance;
	protected Scanner sc;

	public BankAccount() 
	{
		sc=new Scanner(System.in);
	}
	public void deposit()
	{
		System.out.println("Enter Account Number ");
		accountNumber=sc.nextInt();
		System.out.println("Enter Account Number ");
		
	}

	public void withdraw() {
		
	}
	
	public void getBalance() {
		
	}
}
