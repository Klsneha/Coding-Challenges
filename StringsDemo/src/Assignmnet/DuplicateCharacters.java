package Assignmnet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharacters {

	public static void main(String args[])
	{
		String str="Difficullllt";
		DuplicateCharacters d=new DuplicateCharacters();
		d.Duplicate(str);
		
	}
	public void Duplicate(String str)
	{
		//String dup="";
		/*ArrayList<Character> dup = new ArrayList<Character>();
		for(int i=0;i<str.length();i++)
		{
			char alpha=str.charAt(i);
			int count=0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(j)==alpha)
				{
					count=count+1;
				}
			}
			if(count>1)
			{
				if(dup.contains(alpha))
					continue;
				else
					dup.add(alpha);
			}
		}
		System.out.println("duplicate values are"+dup);*/
		
		
		HashMap<Character,Integer> map=new HashMap();
		for(int i=0;i<str.length();i++)
		{
			if(map.containsKey(str.charAt(i)))
			{
				int count=map.get(str.charAt(i))+1;
				map.put(str.charAt(i),count);
			}
			else
			{
				map.put(str.charAt(i),1);
			}
		}
		
		Iterator<Map.Entry<Character, Integer>> itr = map.entrySet().iterator(); 
		while(itr.hasNext())
		{
			Entry<Character, Integer> entry = itr.next(); 
			if(entry.getValue()>1)
			System.out.println(entry.getKey());
		}
		
	}
}
