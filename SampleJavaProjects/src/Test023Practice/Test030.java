package Test023Practice;

public class Test030 {
	
	public static void main(String args[])
	{
		int x = 123;
		
		int sum =0;
		
		while(x!=0)
		{
			int digit = x%10;
			
			sum = sum + digit;
			
			x=x/10;
		}
		
		System.out.println(sum);
	}

}
