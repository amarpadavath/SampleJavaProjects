package Test023Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Test026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr = {5, 9, 2, 11, 11, 7, 3};
		 
		 HashSet<Integer> s = new HashSet<>();
		 
		 for(int n : arr)
		 {
			 s.add(n);
		 }
		 
		 System.out.println(s);
		 
		 ArrayList<Integer> w =new ArrayList<>(s);
		 
		 Collections.sort(w);
		 
	System.out.println(w.get(w.size()-2));
	
	System.out.println(w.get(1));
		 

	}

}
