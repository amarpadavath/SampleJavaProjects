package Test023Practice;

import java.util.Scanner;

public class Test031 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" enetr a number");
		
		int num = sc.nextInt();
        sc.close();

        int original = num;
        int sum = 0;
        int digits= String.valueOf(num).length();
        
        while(num!=0)
        {
        	int digit = num%10;
        	
        	sum +=  Math.pow(digit, digits);
        	
        	num = num/10;
        }
        
        System.out.println(sum);
        
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }
		
	}

}
