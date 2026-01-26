package Test023Practice;

import java.util.Scanner;

public class Test018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		for(int i =0;i<=x;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
