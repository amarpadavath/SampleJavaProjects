package Test023Practice;

public class Test017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 2132156165;
		int count = 0;
		
		while(x!=0)
		{
			x=x/10;
			count++;
		}
		
		System.out.println(count);

	}

}
