package Test021Practice;

import java.util.HashMap;
import java.util.Map;

public class Test013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String b = "I ama amar";
		
		String s = b.replace(" ", "");
		
		
		char[] array = s.toCharArray();
		
		HashMap<Character,Integer> m = new HashMap<Character,Integer>();
		
		for(char c : array)
		{
			if(m.containsKey(c))
			{
				m.put(c, m.get(c)+1);
			}
			
			else
			{
				m.put(c, 1);
			}
		}
		
		System.out.println(m);
		
		for(Map.Entry<Character, Integer> w : m.entrySet())
		{
			if(w.getValue()>1)
			{
				System.out.println(w.getKey()+""+w.getValue());
			}
		}

	}

}
