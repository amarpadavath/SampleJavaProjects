package Test023Practice;

import java.util.Scanner;

public class Test019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		for(int i=0;i<=x;i++)
		{
			for(int space=0;space<=x-i;space++)
			{
				System.out.print(" ");
			}
			
			for(int star=0;star<(2*i-1);star++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		

	}

}
