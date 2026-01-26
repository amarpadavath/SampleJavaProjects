package Test023Practice;

public class Test014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x =11;
		
		if(x<=1)
		{
			System.out.println(" it is not a prime number");
			
			return;
			
		}
		
		boolean isPrime=true;
		
		for(int i=2;i<=Math.sqrt(x);i++)
		{
			
			if(x%i==0)
				
			{
				isPrime=false;
				break;
			}
			
		}
		
		if(isPrime)
		{
			System.out.println("prime no");
		}
		else
		{
			System.out.println("no prime");
		}
		
		

	}

}
