package Test024Practice;

public class Test001 {

	
		
	    public static void main(String[] args) {
	        int a = 10;
	        System.out.println("Before method call: " + a);
	        changeValue(a);
	        System.out.println("After method call: " + a); // still 10
	    }

	    static void changeValue(int num) {
	        num = 20; // only changes local copy
	    }

	

}
