package arraydemo;
import java.util.*;
public class NameArray1 {
private String names[];
private Scanner sc;
int noofnames;

public NameArray1()
{
sc=new Scanner(System.in);

System.out.println("Specify how many names u want to enter ");
noofnames=sc.nextInt();
names=new String[noofnames];
}
public void accept()
{
for(int x=0;x<names.length;x++)
{
System.out.println("Enter Name for position "+x);
names[x]=sc.next();
}

}
public void display()
{
for(int x=0;x<names.length;x++)
{
System.out.println("Value is "+names[x]);
}
System.out.println("Another way of displaying values");
for(String val:names)
{
System.out.println("printing values "+val);
}
}
public static void main(String args[])
{
NameArray1 nameobj=new NameArray1();
nameobj.accept();
nameobj.display();
}
}