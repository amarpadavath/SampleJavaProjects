package Test023Practice;

public class Test010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String b = "Aaaautomation testimg";
		
		String s = b.toLowerCase();
		char s1 = 'a';
		int count=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)==s1)
			{
				count++;
			}
		}
		
		System.out.println(count);

	}

}
