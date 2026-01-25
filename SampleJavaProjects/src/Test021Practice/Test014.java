package Test021Practice;

public class Test014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] n = {13,45,89,2,33,56};
		
		int largest = n[0];
		
		for(int i=0;i<n.length;i++)
		{
			if(n[i]>largest)
			{
				largest=n[i];
			}
		}
		
		System.out.print(largest);
		

	}

}
