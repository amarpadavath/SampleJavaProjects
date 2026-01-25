package Test021Practice;

import java.util.ArrayList;
import java.util.HashSet;

public class Test016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> s = new ArrayList();
		
		s.add("amar");
		s.add("amar1");
		s.add("amar2");
		s.add("amar");
		
		System.out.println(s);
		
		HashSet<String> w = new HashSet<>(s);
		
		System.out.println(w);

	}

}
