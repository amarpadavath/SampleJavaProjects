package Test024Practice;

public class Test006validateAge {
	
	public static void main(String args[]) throws Test005InvalidAgeException
	{
		Test006validateAge s = new Test006validateAge();
		s.validateAge(20);
	}
	
	public void validateAge(int age) throws Test005InvalidAgeException
	{
	try
	{
		if(age>18)
		{
			throw new Test005InvalidAgeException("Age must be 18+");
		}
	}
	
	catch(Test005InvalidAgeException e)
	{
		System.out.println(e.getMessage());
	}
	}

}
