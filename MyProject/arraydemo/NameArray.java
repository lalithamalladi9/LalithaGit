package arraydemo;

public class NameArray {
private String names[];

public NameArray()
{
names=new String[5];
}
public void accept()
{
names[0]="Bisengo";
names[1]="Dimple";
names[2]="Lalitha";
names[3]="Ying";
names[4]="Anaita";

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
NameArray nameobj=new NameArray();
nameobj.accept();
nameobj.display();
}
}