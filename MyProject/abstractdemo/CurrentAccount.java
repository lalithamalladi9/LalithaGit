package abstractdemo;

public class CurrentAccount extends Account {
	
	//for CurrentAccount it should be 5% of balance*/
	double interest;
	
	
	@Override
	public void calculateInterest() {
		
		interest=balance*0.07;
	}
	
	@Override
	public void display() {
		
		System.out.println(" The Current account interest is "+interest);
	}



}
