package SubdomainVisitCount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	 
	
	public static void main(String args[])
	{
		String s[]= {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
		Solution s1=new Solution();
		List li=s1.subdomainVisits(s);
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
	}
	
	 public List<String> subdomainVisits(String[] s) {
	        
		 HashMap<String,Integer> map=new HashMap<>();
			
			for(int i=0;i<s.length;i++)
			{
				String[] sarr=s[i].split("\\s+");
				if(map.containsKey(sarr[1]))
				{
					int count=map.get(sarr[1]);
					map.put(sarr[1],Integer.parseInt(sarr[0])+count);
				}
				else
				{
					
					map.put(sarr[1],Integer.parseInt(sarr[0]));
				}
				
				String[] substr=sarr[1].split("\\.");
				int index=0;
				for(int j=0;j<substr.length-1;j++)
				{
					index=index+substr[j].length()+1;
					String sub=sarr[1].substring(index);
					if(map.containsKey(sub))
					{
						int count=map.get(sub);
						map.put(sub,Integer.parseInt(sarr[0])+count);
					}
					else
					{
						map.put(sub,Integer.parseInt(sarr[0]));
					}
				}
				
			}
			
			List<String> li=new ArrayList<>();
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
			    String key = entry.getKey();
			    Object value = entry.getValue();
			    String st= value+" "+key;
			    li.add(st);
			    
			}
			
			return li;

	        
	 }
}