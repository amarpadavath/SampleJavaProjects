package Test025Practice;

public class Test002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Ia am amar";
		
		String rev = "";
		
		String[] d = s.split(" ");
		
		for(int i=d.length-1;i>=0;i--)
		{
			rev = rev + d[i] + " ";
		}
		
		System.out.println(rev.trim());
		
		

	}

}
