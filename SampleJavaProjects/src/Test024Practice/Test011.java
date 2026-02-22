package Test024Practice;

import java.util.HashMap;
import java.util.Map;

public class Test011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[] arr = {2,4,41,48,3, 3, 4, 2, 5, 4,5,5,7,18,18,18};
	    
	    HashMap<Integer,Integer> map = new HashMap<>();
	    
	    for(int s : arr)
	    {
	    	if(map.containsKey(s))
	    	{
	    		map.put(s, map.get(s)+1);
	    	}
	    	
	    	else
	    	{
	    		map.put(s, 1);
	    	}
	    }
	    
	    int maxInt = 0;
	    
	    int maxCount = 0;
	    
	    
	    
	   // for(Map.Entry<Integer, Integer> e : map.entrySet())
	   // {
	    	//if(e.getValue()>maxCount)
	    	//{
	    	//	maxCount=e.getValue();
	    	//	maxInt= e.getKey();
	    		
	    		
	    	//}
	   // }
	    
	   // System.out.println(maxCount);
	   // System.out.println(maxInt);
	    
	    for(Map.Entry<Integer, Integer> e : map.entrySet())
	    {
	    	if(e.getValue()>1)
	    	{
	    		System.out.println(e.getKey()+" "+e.getValue());
	    		
	    		
	    	}
	    }
	    
	    
	    

	}

}
