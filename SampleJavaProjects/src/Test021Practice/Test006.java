package Test021Practice;

public class Test006 {
	
	public static void main(String args[])
	{
		String s = "fhghvbn cvhvhbnbv vbnvbnvbn";
		
		String revS="";
		
		String[] g = s.split(" ");
		
		for(int i=0;i<=g.length-1;i++)
		{
			String word = g[i];
			String revW="";
			
			for(int j= word.length()-1;j>=0;j--)
			{
				revW = revW + word.charAt(j);
			}
			
			revS = revS + revW + " ";
			
			
		}
		
		System.out.println(revS.trim());
	}

}
