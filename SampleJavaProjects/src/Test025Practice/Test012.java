package Test025Practice;

public class Test012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "nmbhjb kjbkjn kjnkjbnkj";
		
		String s[] = test.split(" ");   
		
		String rev ="";
		
		for(int i = s.length-1;i>=0;i--)
		{
			rev = rev + s[i];
		}

	}

}
