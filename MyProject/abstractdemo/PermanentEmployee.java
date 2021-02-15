package abstractdemo;

public class PermanentEmployee extends Employee{
private double salary;
private double annualsalary;

@Override
public void accept()
{
super.accept();
System.out.println("Enter salary ");
salary=sc.nextDouble();

}

@Override
public void calculateSalary()
{
annualsalary=salary*12;


}
@Override
public void display()
{
super.display();
System.out.println("Annual Salary is "+annualsalary);
}


}