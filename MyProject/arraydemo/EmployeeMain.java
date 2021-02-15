package arraydemo;
import java.util.*;
	public class EmployeeMain {
		private Employee emparr[];
		int noofemployee;
		private Scanner sc;
		int sum;
		int average;
		public EmployeeMain()
		{
			sc=new Scanner(System.in);
			System.out.println("Enter noof employees ");
			noofemployee=sc.nextInt();
			emparr=new Employee[noofemployee];
			sc.close();
			
		}
		public void acceptDetails()
		{
			for(int x=0;x<emparr.length;x++)
			{
			Employee e1=new Employee();
			e1.accept();
			emparr[x]=e1;
			 sum+=e1.getSalary();
			}
			average=sum/emparr.length;
			
		}
		public void displayDetails()
		{
			for(Employee e1:emparr)
			{
			e1.display();
			}
			System.out.println("Average Salary of the employees is "+average);
		}
		
		public static void main(String args[])
		{
			EmployeeMain empmain=new EmployeeMain();
			empmain.acceptDetails();
			empmain.displayDetails();
		}
		
}