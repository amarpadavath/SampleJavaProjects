package Test021Practice;

public class Test004 {
	
	public static void main(String args[])
	{
		
		String s = "I am amar";
		
		String[] b = s.split(" ");
		
		String rev = "";
		
		for(int i = b.length-1;i>=0;i--)
		{
			rev = rev + b[i]+" ";
			
		}
		
		System.out.println(rev.trim());
		
		
	}

}
