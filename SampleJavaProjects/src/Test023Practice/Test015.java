package Test023Practice;

public class Test015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x =11;
		
		//int num;
		
		for(int  num=2;num<=x;num++)
			
		{
			boolean isPrime=true;
			
			for(int i=2;i<=Math.sqrt(num);i++)
			{
				if(num%i==0)
				{
					
					isPrime=false;
					break;
				}
			}
			
			if(isPrime)
			{
				System.out.print(num+" ");
			}
		}
		
		

	}

}
