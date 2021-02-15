package arraydemo;
import java.util.*;

public class ArrayMinMax {
	private Scanner sc;
	int numbers[];
	int noofnumbers;
	int sum,min, max;
	
	public ArrayMinMax()
	{
		sc= new Scanner(System.in);
		System.out.println("Enter the noofnumbers ");
		noofnumbers=sc.nextInt();
		numbers=new int[noofnumbers];
		for(int x=0;x<numbers.length;x++)
		{
		System.out.println("Enter the number "+x);
		numbers[x]=sc.nextInt();
		}
		
	}
	
	public void accept()
	{
		min=numbers[0];
		for(int i=0;i<numbers.length;i++)
		{
			//sum+=numbers[i];
			if(min>numbers[i])
			{
				min=numbers[i];
			}
			else
			{
				max=numbers[i];
			}
		}
	}
		
	public void display()
	{
		
		System.out.println("Minimum number is "+ min);
		System.out.println("Maximum number is "+ max);
	}
		
	public static void main (String [] args)
	{
		ArrayMinMax amm = new ArrayMinMax();
		amm.accept();
		amm.display();
		
	}
		
		
	
}	
	


