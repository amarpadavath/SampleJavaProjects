package Test023Practice;

import java.util.HashMap;

public class Test012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="AUtomation testinf jkkjks";
		char[] b =s.toLowerCase().toCharArray();
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(char c : b)
		{
			if(!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'))
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
		}
		
		System.out.println(map);
		

	}

}
