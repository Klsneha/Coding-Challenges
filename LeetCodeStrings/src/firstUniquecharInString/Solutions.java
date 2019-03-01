package firstUniquecharInString;
import java.util.*;
public class Solutions {

	public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap();
        int num=0;
        for(int i=0;i<s.length();i++)
        {
	            	if(map.containsKey(s.charAt(i)))
	            	{
	            		map.put(s.charAt(i),map.get(s.charAt(i))+1 );
	            	}
            	else
            	{
            		
            		map.put(s.charAt(i),1);
            	}
            
        }
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		}
        
        for(int i=0;i<s.length();i++)
        {
        	if(map.get(s.charAt(i))==1)
        	{
        		num=i;
        		break;
        	}
        }
        return num;
        
        
    }
	public static void main(String args[])
	{
		Solutions s=new Solutions();
		int i=s.firstUniqChar("loveleetcode");
		System.out.println(i);
	}
}
