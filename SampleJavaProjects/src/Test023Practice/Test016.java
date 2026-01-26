package Test023Practice;

import java.util.Scanner;

public class Test016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		long fact = 1;
		for(int i=2;i<=x;i++)
		{
			fact= fact*i;
		}
		
		System.out.println(fact);
		
		
	}

}
