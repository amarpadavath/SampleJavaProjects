package Test024Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {10, 20, 30, 40};
		
		System.out.println(num.length);
		
		for(int n : num)
			
		{
			System.out.println(n);
		}
		
		for(int i =0;i<=num.length-1;i++)
		{
			System.out.println(num[i]);
		}
		
		//Arrays.fill(null, false);
		
		 String[] strArray = {
			        "A",
			        "B",
			        "C"
			    };
			  //  List < String > list1 = Arrays.asList(strArray);
			    
			    System.out.println(Arrays.toString(strArray));
			    
			    String s = "I ama amartttt";
			    
			    String[] b = s.split(" ");
			    
			    String rev = "";
			    
			    for(int i=b.length-1;i>=0;i--)
			    {
			    	rev = rev + b[i] + " ";
			    }
			    
			    System.out.println(rev.trim());
			    
			    String ch = s.replace(" ","").toLowerCase();
			    
			    char[] q = ch.toCharArray();
			    
			    HashMap<Character,Integer> map = new HashMap<>();
			    
			    for(char e : q)
			    {
			    	if(map.containsKey(e))
			    	{
			    		map.put(e,map.get(e)+1);
			    		
			    	}
			    	
			    	else
			    	{
			    		map.put(e, 1);
			    		
			    	}
			    }
			    
			    System.out.println(map);
			    
			   char maxChar = ' ';
			    int maxInt = 0;
			    
			    for(Map.Entry<Character, Integer> e : map.entrySet())
			    {
			    	if(e.getValue()>maxInt)
			    	{
			    		
			    		maxInt = e.getValue();
			    		maxChar = e.getKey();
			    		
			    		
			    	}
			    }
			    
			    for(Map.Entry<Character, Integer> e1 : map.entrySet())
			    {
			    	if(e1.getValue()==maxInt)
			    	{
			    		
			    	System.out.println(e1.getKey());
			    		
			    		
			    	}
			    }
			    
			    
			    
			    
			    
		
		

	}

}
