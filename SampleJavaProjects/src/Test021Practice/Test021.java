package Test021Practice;

public class Test021 extends Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Math s  = new Math();
		Test021 s = new Test021();
		
		System.out.println(s.add(10.5, 20.2));
		s.add(10,23);
		

	}

}

class Math {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
