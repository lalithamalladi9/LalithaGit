package abstractdemo;
import java.util.*;
public abstract class Employee {
private int empid;
private String empname;
protected Scanner sc;
public Employee()
{
sc=new Scanner(System.in);

}
public void accept()
{
System.out.println("Enter Employee id ");
empid=sc.nextInt();
System.out.println("Enter Employee name ");
empname=sc.next();
}
public void display()
{
System.out.println("Employee id "+empid);
System.out.println("Employee name "+empname);
}
abstract public void calculateSalary();

}