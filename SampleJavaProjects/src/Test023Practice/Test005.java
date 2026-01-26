package Test023Practice;

import java.util.HashMap;
import java.util.Map;

public class Test005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "xbcvbcvbcvb cvbcv cvbcvbcv";
		
		String s1 = s.replace(" ", "");
		
		char[] d = s1.toCharArray();
		
		
		HashMap<Character,Integer> map =new  HashMap<>();
		
		for(char c : d)
		{
			if(map.containsKey(c))
			{
				map.put(c,map.get(c)+1);
				
			}
			
			else
			{
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
		
		for(Map.Entry<Character, Integer> f: map.entrySet())
		{
			if(f.getValue()>1)
			{
				System.out.println(f.getValue()+" "+f.getKey());
			}
		}
		

	}

}
