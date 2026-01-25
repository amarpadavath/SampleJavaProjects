package Test021Practice;

public class Test015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] s = {2,3,6,8,10};
		
		int x = 14;
		
		for(int i=0;i<=s.length-1;i++)
		{
			for(int j = i+1;j<=s.length-1;j++)
				
			{
				if(s[i]+s[j]==x)
				{
					System.out.println(s[i]+" adds "+s[j]+" equals "+x);
				}
			}
		}

	}

}
