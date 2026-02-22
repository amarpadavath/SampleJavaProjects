package Test025Practice;

import java.util.HashMap;
import java.util.Map;

public class Test004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "dsgfd xcbvcxb cvbcvb";
		
		char[] d = s.toCharArray();
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(char d1 : d)
		{
			if(map.containsKey(d1))
			{
				map.put(d1, map.get(d1)+1);
			}
			
			else
			{
				map.put(d1, 1);
			}
		}
		
		System.out.println(map);
		
		char maxChar = ' ';
		int maxInt = 0;
		
		for(Map.Entry<Character, Integer> w : map.entrySet())
		{
			if(w.getValue()>maxInt)
			{
				maxInt=w.getValue();
				maxChar= w.getKey();
				
				
			}
		}
		
		for(Map.Entry<Character, Integer> w : map.entrySet())
		{
			if(w.getValue()==maxInt)
			{
				System.out.print(w.getKey()+""+w.getValue());
				
			}
		}
		
		
		
		

	}

}
