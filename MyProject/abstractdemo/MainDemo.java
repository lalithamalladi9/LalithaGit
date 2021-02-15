package abstractdemo;

public class MainDemo {

public static void main(String[] args) {
Employee emp;
System.out.println("Calling permanent employee");
emp=new PermanentEmployee();//it can access only those methods which is
//declared in Employee class
emp.accept();
emp.calculateSalary();
emp.display();

System.out.println("Calling temp employee");
emp=new TempEmployee();
emp.accept();
emp.calculateSalary();
emp.display();

}

}