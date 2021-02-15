package abstractdemo;

public class TempEmployee extends Employee {
private double contPeriod;
private double contAmount;
private double sal;
@Override
public void accept()
{
super.accept();
System.out.println("Enter Contract period");
contPeriod=sc.nextDouble();
System.out.println("Contract Amount ");
contAmount=sc.nextDouble();

}
@Override
public void calculateSalary() {
sal=contAmount*contPeriod;



}
@Override
public void display()
{
super.display();
System.out.println("Salary is "+sal);
}


}