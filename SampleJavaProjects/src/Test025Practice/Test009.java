package Test025Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test009 {
	
	public static void main(String args[])
	{
		
		int[] s = {10,20,30,30,40,50,50};
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int d : s)
		{
			
			if(map.containsKey(d))
			{
				map.put(d,map.get(d)+1);
			}
			else
			{
				map.put(d, 1);
			}
	
			
			
			
		}
		
		System.out.println(map);
		
	int	maxKey = 0;
	int 	maxValue=0;
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			
			if(entry.getValue()>maxValue)
			{
				maxValue=entry.getValue();
				maxKey= entry.getKey();
			}
			
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			
			if(entry.getValue()==maxValue)
			{
				System.out.println(entry.getKey());
			}
			
		}
		
	}

}
