package Test023Practice;

import java.util.Arrays;

public class Test029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "SiLeNt CAT";
		String s2 = "LisTen AcT";
		String cs1= s1.toLowerCase().replace(" ", "");
		String cs2= s2.toLowerCase().replace(" ", "");
		
		boolean status = true;
		
		if(cs1.length()==cs2.length())
		{
			char[] ch1= cs1.toCharArray();
			char[] ch2 = cs2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			status =Arrays.equals(ch1, ch2);
			
			//System.out.println(Arrays.equals(ch1, ch2));
		}
		
		else
		{
			status= false;
			
		}
		
		if(status)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("not Anagram");
		}
		
		
		
				
	}

}
