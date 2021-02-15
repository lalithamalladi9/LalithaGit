package mydemo;
import java.util.*;
public class Employee {
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
System.out.println("Enter Emmployee Name ");
empname=sc.next();

}
public void display()
{
System.out.println("Employee id is "+empid);
System.out.println("Employee name is "+empname);
}

}