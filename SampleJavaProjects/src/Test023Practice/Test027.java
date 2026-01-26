package Test023Practice;

public class Test027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayOne = {2,5,1,7,4};
		int[] arrayTwo = {2,5,1,7,5};
		boolean requalorNot= true;
		
	if(arrayOne.length==arrayTwo.length)
	{
		for(int i = 0;i<=arrayOne.length-1;i++)
		{
			if(arrayOne[i]!=arrayTwo[i])
			{
				requalorNot= false;
			}
		}
	}
	
	else
	{
		requalorNot= false;
	}
		if(requalorNot)
		{
			System.out.println("equals");
			
		}
		else
		{
			System.out.println("not equal");
		}

	}

}
