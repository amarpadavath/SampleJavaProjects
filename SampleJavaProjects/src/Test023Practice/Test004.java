package Test023Practice;

public class Test004 {

	public static void main(String args[])
	{
		String c = "fgfbgc cvbcvb cvbcv cvbcv cvbcvb";
		
		String[] b = c.split(" ");
		
		String revS = "";
		
		for(int i =0;i<=b.length-1;i++)
		{
			String f = b[i];
			
			String revW="";
			
			for(int j= f.length()-1;j>=0;j--)
			{
				
				revW= revW + f.charAt(j);
			}
			
			revS = revS+ revW+ " ";
		}
		
		System.out.println(revS.trim());
	}
}
