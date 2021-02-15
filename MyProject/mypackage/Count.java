package mypackage;
import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the sentence to count :");
		String str = in.nextLine();
		in.close();
		
		char[]ch = str.toCharArray();
		int letter =0;
		int num=0;
		int space=0;
		int other=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isLetter(ch[i])) {
				letter++;
			}
			else if(Character.isDigit(ch[i])) {
				num++;
			}
			else if(Character.isSpaceChar(ch[i])) {
				space++;
			}
			else other++;
			
		}
	
		System.out.println("Letters"+letter);
		System.out.println("Numbers"+num);
		System.out.println("Space"+space);
		System.out.println("Others"+other);
	}

}
