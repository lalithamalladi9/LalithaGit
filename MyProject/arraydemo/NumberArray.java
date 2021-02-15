package arraydemo;
import java.util.*;
	public class NumberArray {
	private int numbers[];
	Scanner in = new Scanner(System.in);
	int sum=0;
	int odd=0;
	int even=0;
	
	public NumberArray()
		{
			numbers = new int[10];
		}
	public void accept()
		{
		for(int x=0;x<numbers.length;x++)
		{
		System.out.println("Enter the number "+x);
		numbers[x]=in.nextInt();
		}
		
		}
	public void display()
		{
		for(int x=0;x<numbers.length;x++)
		{
			sum=numbers[x]+sum;
			if(numbers[x]%2==0) {
				even++;
			}
			
			else {
				odd++;
			}
			
		}
		System.out.println(" Sum of all numbers is :"+sum);
		System.out.println(" No of Odd Numbers are: "+odd);
		System.out.println("No of Even Numbers are:"+even);
		}
	
	
		public static void main(String args[])
		{
		NumberArray nameobj=new NumberArray();
		nameobj.accept();
		nameobj.display();
	}
	}