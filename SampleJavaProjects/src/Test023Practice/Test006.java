 package Test023Practice;

import java.util.HashMap;
import java.util.Map;

public class Test006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String u = "fgbcvb cvbcv cvbcvbcvbvcrtyyyyyyy";
		
		String s = u.replace(" ","");
		
		char[] d = s.toCharArray();
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(char c : d)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			
			else
			{
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
		
		char maxChar=' ';
		
		int maxValue=0;
		
		for(Map.Entry<Character, Integer> w : map.entrySet())
		{
			if(w.getValue()>maxValue)
			{
				maxChar=w.getKey();
			maxValue=w.getValue();
			}
			
		}
		
		System.out.println(maxChar);
		System.out.println(maxValue);
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
		    if (entry.getValue() == maxValue) {
		        System.out.print(entry.getKey() + " ");
		    }
		}
		
	
		 
		
		
		
		
		
				

	}

}
