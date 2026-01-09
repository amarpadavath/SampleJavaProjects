package Test021Practice;

import java.util.Scanner;

public class Test003 {
	
	public static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		
		int num = x;
		
		int rev = 0;
		
		//int count;
		
		while(x!=0)
		{
			int digit = x %10;
			
			rev = rev *10 + digit;
			
			x=x/10;
			
		}
		
		System.out.println(rev);
		
		
	}
;
}
