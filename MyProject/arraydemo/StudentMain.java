package arraydemo;
import java.util.*;
public class StudentMain {
	private Scanner sc;
	private Student starr[];
	int noofstudent;
	
	public StudentMain()
	{
		sc=new Scanner(System.in);
		System.out.println("Enter no of student ");
		noofstudent=sc.nextInt();
		starr=new Student[noofstudent];
	}
	
	public void accept()
	{
		for(int x=0;x<starr.length;x++)
		{
		Student s1=new Student();
		System.out.println("Enter Studentid ");
		s1.setStudentid(sc.nextInt());
		System.out.println("Enter Student name ");
		s1.setStudentname(sc.next());
		System.out.println("Enter marks ");
		s1.setMarks(sc.nextInt());
		starr[x]=s1;
		}
	}
	public void display()
	{
		for(Student s:starr)
		{
		System.out.println("Student name "+s.getStudentname());
		}
	}
	public static void main(String arg[])
	{
		StudentMain stmain=new StudentMain();
		stmain.accept();
		stmain.display();
	}
}