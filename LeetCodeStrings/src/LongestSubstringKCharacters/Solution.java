package LongestSubstringKCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
	
public int longestSubstring(String s, int k) {
        
	int max=0;
      for(int i=0;i<s.length();i++)
      {
    	  
    	  HashMap<Character,Integer> map=new HashMap<Character,Integer>();
    	  int j=i;
    	  while(j<s.length())
    	  {
    		  boolean flag=true;
    		  		char a=s.charAt(j);
    		  		//System.out.println(a);
    		  
      				  if(map.containsKey(a))
    				  {
    					  int val=map.get(a);
    	    			  map.put(a,val+1);  
    				  }
    				  else
    				  {
    					  map.put(a,1);
    				  }
      				int len=s.substring(i, j).length()+1;
      				if(len>=k)
      				{
      					
      				
      				for(Map.Entry<Character, Integer> entry: map.entrySet())
      		    	{
      		    		if(entry.getValue()<k)
      		    		{
      		    			flag=false;
      		    			break;
      		    		}
      		    				 
      		    	}
      		    			  
      		    	if(flag)
      		    	{
      		    		
      		    		if(max<len)
      		    			max=len;
      		    		System.out.println(max);
      		    	}
      				}
      				  
      		j++;
    					  
    	  }
    			  
    	
    			  
    		  
    	  
      }
      return max;
    }
public static void main(String[] args) {
	String st="aaabb";
	Solution s=new Solution();
	int k=3;
	System.out.println(s.longestSubstring(st, k));
	
}

}
