package Test025Practice;

public class Test007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String s = "amar can do";
		  
		  String sa[] = s.split(" ");
		  
		  String rev = "";
		  
		  for(int i = sa.length-1;i>=0;i--)
		  {
			  rev = rev + sa[i] + " ";
		  }
		  
		  System.out.println(rev);

	}

}
