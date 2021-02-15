package mypackage;
public class SingleTonDemo {
private static SingleTonDemo sobj;
private SingleTonDemo()
{

}
public static SingleTonDemo getSingleTonObj()
{
	sobj=new SingleTonDemo();
	return sobj;
}
public void display()
{
	System.out.println("calling display method");
}
public void add(int x,int y)
{
	System.out.println("Value of x and y is "+x+" "+y);
}

}