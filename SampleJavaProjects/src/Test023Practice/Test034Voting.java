package Test023Practice;

public class Test034Voting {

public static void main(String args[])	 
{
	try
	{
	checkAge(16);
	}
	catch(Test033InvalidAgeException e)
	{
		System.out.println(e.getMessage());
	}
}

static void checkAge(int age) throws Test033InvalidAgeException
{
	if(age<18)
	{
		throw new Test033InvalidAgeException("Age must be 18 or above");
	}
	
	else
	{
		System.out.println("Throws exception");
	}
}
}
