package Test023Practice;

public class Test008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  e = "fcxvcx xcvxc asaaa";
		String s = e.replace(" ", "");
		
		int x = s.length();
		int count=0;;
		
		for(int i=0;i<=x-1;i++)
			
		{
			
			if(!(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'))
			{
				System.out.println(s.charAt(i));
				count++;
			}
		}
		
		System.out.println(count);

	}

}
