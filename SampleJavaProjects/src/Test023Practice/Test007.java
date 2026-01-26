package Test023Practice;

import java.util.HashMap;
import java.util.Map;

public class Test007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello Hello test test xcvxc xcvxcvxc";
		
		String f = s.toLowerCase();
		
		String[] s1 = f.split(" ");
		
		HashMap<String,Integer> map= new HashMap<>();
		
		
		for(String s2 : s1)
		{
			if(map.containsKey(s2))
			{
				map.put(s2, map.get(s2)+1);
			}
			
			else
			{
				map.put(s2, 1);
			}
				
		}
		
		System.out.println(map);
		
		String maxString=" ";
		int maxInt=0;
		
		for(Map.Entry<String, Integer> w : map.entrySet())
		{
			if(w.getValue()>maxInt)
			{
				//System.out.println(w.getKey()+" "+w.getValue());
				
				maxInt = w.getValue();
				maxString = w.getKey();
				
				
			}
		}
		
	//	System.out.println(maxInt);
	//	System.out.println(maxString);
		
		for(Map.Entry<String, Integer> q : map.entrySet())
		{
			if(q.getValue()==maxInt)
			{
				System.out.println(q.getKey());
			}
		}
		

	}

}
