package Test023Practice;

import java.util.Scanner;

public class Test022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		int a =0;
		
		int b=1;
		
		for(int i=1;i<=x;i++)
		{
			System.out.print(a+" ");
			
			int next = a+b;
			a=b;
			b=next;
		}
		
		
		

	}

}
