package Test023Practice;

public class Test003 {
	
	public static void main(String args[])
	
	{
		String s = "Ihs skds djdn dmd";
		
		String[] b = s.split(" ");
		
		String rev ="";
		
		for(int i = b.length-1;i>=0;i--)
		{
			rev = rev + b[i] + " ";
			
		}
		
		System.out.println(rev);
		
	}

}
