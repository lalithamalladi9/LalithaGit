package arraydemo;
import java.util.*;
	public class Employee {
		private int empid;
		private String empname;
		private double salary;
		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}
		private int age;
		private Scanner sc;
		
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
			System.out.println("Enter Salary ");
			salary=sc.nextDouble();
			System.out.println("Enter age ");
			age =sc.nextInt();
		}
		public void display()
		{
			System.out.println("Employee id is "+ empid);
			System.out.println("Employee name is "+empname);
			System.out.println("Employee Salary is "+salary);
			System.out.println(age>0? "Employee age is "+age :"Wrong age");
		}
		
		
	}