package Test026Practice;

public class Test005 {
	
	public static void main(String args[]) throws Test004CheckedException {
		// Some code that may throw the exception
		int x =15;
		try
		{
		if (x>15) {
		System.out.print("true");
		}
		}
		catch (Exception e) {
			throw new Test004CheckedException("Custom checked exception occurred");
		}
		

	
}
}
