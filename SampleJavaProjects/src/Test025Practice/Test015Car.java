package Test025Practice;

public class Test015Car extends  Test013Vehicle {
	
	String model = "Mustang"; // Car attribute
	
	public void display() {
		System.out.println("Brand: " + brand); // Accessing parent class attribute
		System.out.println("Model: " + model); // Accessing child class attribute
		}



}
