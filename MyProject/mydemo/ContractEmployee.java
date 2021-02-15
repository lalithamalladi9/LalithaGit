package mydemo;

public class ContractEmployee extends Employee {
private double contractAmount;
private int contractPeriod;
@Override
public void accept()
{
super.accept();
System.out.println("Enter Contract Amount ");
contractAmount=sc.nextDouble();
System.out.println("Enter contract period ");
contractPeriod=sc.nextInt();

}
@Override
public void display()
{
super.display();
System.out.println("Contract Amount is "+contractAmount);
System.out.println("Contract Period is "+contractPeriod);
}
public static void main(String args[])
{
System.out.println("Calling details for permaent Employee");
PermanentEmployee p1=new PermanentEmployee();
p1.accept();
p1.display();
System.out.println("Calling details for contract employee");
ContractEmployee c1=new ContractEmployee();
c1.accept();
c1.display();
}

}