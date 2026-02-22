package Test026Practice;

public class Test004CheckedException extends Exception {
	
	// Constructor with a custom message

	
	public Test004CheckedException(String message)
	{
		super(message);
	}
	
	// Constructor with a custom message and cause
	public Test004CheckedException(String message, Throwable cause) {
	super(message, cause);
	}

}
