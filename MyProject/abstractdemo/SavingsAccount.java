package abstractdemo;

public class SavingsAccount extends Account {
	//For SavingAccount it should be 7% of Balance.

	double interest;
	
	@Override
	public void calculateInterest() {
		
		interest=balance*0.05;
	}
	
	@Override
	public void display() {
		
		System.out.println(" The Savings account interest is "+interest);
	}

}
