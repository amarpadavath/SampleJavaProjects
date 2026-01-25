package Test021Practice;

import java.util.Arrays;
import java.util.HashSet;

public class Test018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] i1 = {1, 2, 3, 4, 5, 4};
		 
        Integer[] i2 = {3, 4, 5, 6, 7, 4};
		
	HashSet<Integer> s1 = new HashSet<Integer>(Arrays.asList(i1));
	HashSet<Integer> s2 = new HashSet<Integer>(Arrays.asList(i2));
	
	s1.retainAll(s2);
	System.out.println(s1);

	}

}
