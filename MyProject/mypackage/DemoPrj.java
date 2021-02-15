package mypackage;

public class DemoPrj {
public static void main(String args[])
{
SingleTonDemo s=SingleTonDemo.getSingleTonObj();
s.display();
s.add(40, 89);
SingleTonDemo s1=SingleTonDemo.getSingleTonObj();
s1.add(70, 80);
s1.display();
}

}