package Test025Practice;

public class Test003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "amar test amar1";
		
		String[]  d = s.split(" ");
		
		String revS = "";
		
		for(int i = 0;i<=d.length-1;i++)
		{
			String revW = "";
			
			String q = d[i];
			
			for(int j=q.length()-1;j>=0;j--)
			{
				revW = revW + q.charAt(j);
			}
			
			revS = revS + revW + " ";
		}
		
		System.out.println(revS);
		
		
		
		
		

	}

}
