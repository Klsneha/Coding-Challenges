package PositionOfLargeGroup;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public List<List<Integer>> largeGroupPositions(String S) {
        
		List<List<Integer>> li=new ArrayList<List<Integer>>();
		int i=0;
		while(i<S.length())
		{
			int j=i+1;
			while(j<S.length())
			{
				if(S.charAt(i)!=S.charAt(j))
					break;
				else
				{
					j++;
					
				}
			}
			if(j-i>=3)
			{
				List<Integer> l=new ArrayList<Integer>();
				l.add(i);
				l.add(j-1);
				li.add(l);
				i=j;
			}
			else
				i++;
			
			
	
		}
		return li;
	    
    }
	
	public static void main(String args[])
	{
		Solution s=new Solution();
		List li=s.largeGroupPositions("abcdddeeeeaabbbcd");
		for(int i=0;i<li.size();i++)
		{
			List l=(List) li.get(i);
			for(int j=0;j<l.size();j++)
			{
				System.out.print(l.get(j));
			}
		}
	}
}
