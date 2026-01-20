package Test021Practice;

import java.util.Scanner;

public class Test011 {
	
	public static void main(String args[])
	{
		
		
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		for(int i =1;i<=x;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
	}

}
