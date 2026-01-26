package Test023Practice;

public class Test023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] n = {13,45,89,2,33,56};
		
		int sm=n[0];
		
		for(int i=0;i<=n.length-1;i++)
		{
			if(n[i]<sm)
			{
				sm=n[i];
			}
		}
		
		System.out.println(sm);
		
			

	}

}
