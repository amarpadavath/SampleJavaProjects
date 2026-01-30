package Test024Practice;

public class Test002 {
	
	   public static void main(String[] args) {
	        Student s = new Student();
	        
	        try {
	            int a = 10 / 0;
	        } catch (ArithmeticException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	        
	        finally {
	        	System.out.println("This block always executes");
	        	}
	        
	      
	        s.name = "John";

	        System.out.println("Before method call: " + s.name);
	        changeName(s);
	        System.out.println("After method call: " + s.name); // changed to Mike
	    }

	    static void changeName(Student obj) {
	        obj.name = "Mike"; // modifies the original object
	    }
	    
	    

}

class Student {
    String name;
}
