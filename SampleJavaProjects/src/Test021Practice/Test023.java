package Test021Practice;

public class Test023 {
	
	public static void main(String args[])
	{
		Animal1 a = new Animal1();
		a.sound();
		
		Animal1 a1 = new Dog();
		a1.sound();
		Dog d = new Dog();
		
		d.sound();
		
				
	}

}

public class Animal1 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal1 {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
