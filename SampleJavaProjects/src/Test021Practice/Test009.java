package Test021Practice;

public class Test009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 15;
		
		if(x<=1)
		{
			System.out.println("Not a prime no");
		}
		
		boolean isPrime=true;
		
		for(int i = 2;i<=Math.sqrt(x);i++)
		{
			if(x%i==0)
			{
				isPrime=false;
				break;
			}
		}
		
		if(isPrime==true)
		{
			System.out.println("Prime");
		}
		
		else
		{
			System.out.println("not Prime");
		}

	}

}
