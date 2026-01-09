package Test021Practice;

public class Test005 {
	
	public static void main(String args[])
	{
		String s = "I am amar";
		
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		
		System.out.println(rev);
	}

}
