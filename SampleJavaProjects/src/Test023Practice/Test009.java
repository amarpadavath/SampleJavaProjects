package Test023Practice;

public class Test009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 123;
		int rev=0;
		
		while(x!=0)
		{
			int digit = x%10;
			
			rev = rev*10+ digit;
			
			x=x/10;
			
		}
		
		System.out.println(rev);

	}

}
