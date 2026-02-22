package Test025Practice;

import java.util.HashMap;
import java.util.Map;

public class Test010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "hello hello automation testing";

		String[] df = sentence.split(" ");

		String s = "hello";

		HashMap<String, Integer> map = new HashMap<>();

		for (String d : df) {

			if (map.containsKey(d)) {
				map.put(d, map.get(d) + 1);

			}
			else
			{
				map.put(d, 1);
			}
		}
		
		System.out.println(map);
		
	for(Map.Entry<String, Integer>  test : map.entrySet())
	{
		
		if(test.getKey().equals(s))
		{
			System.out.println(test.getValue());
		}
		
	}

}
}
