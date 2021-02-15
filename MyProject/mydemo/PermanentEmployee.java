package mydemo;

public class PermanentEmployee extends Employee {
private double salary;
@Override
public void accept()
{
super.accept();
System.out.println("Enter Salary ");
salary=sc.nextDouble();
}
public void display()
{
super.display();
System.out.println("Salary is "+salary);
}

}