package Test023Practice;

public class Test011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "TEst test hbhjb kjbb";
		
		String[] b = s.split(" ");
	
		String s1 = "test";
		
		int count =0;
		
		for(String f : b)
		{
			if(f.equalsIgnoreCase(s1))
			{
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
