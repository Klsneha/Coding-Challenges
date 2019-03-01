package Twitter;

import java.util.*;

public class Solution {

	static void closest(String s, List<Integer> queries) {
		List<Integer> li=new ArrayList<Integer>();
		char[] st=s.toCharArray();
		
		for(int i=0;i<queries.size();i++)
		{
			int posLeft=-1;
			int posRight=-1;
			int pos=queries.get(i);
			char ele=s.charAt(pos);
			
			for(int j=pos+1;j<st.length;j++)
			{
				if(s.charAt(j)==ele)
				{
					posRight=j;
					break;
				}
			}
			/*if(posRight==-1)
			{
				posRight=-1;
			}*/
			for(int k=pos-1;k>=0;k--)
			{
				if(s.charAt(k)==ele)
				{
					posLeft=k;
					break;
				}
			}
			/*if(posLeft==0)
			{
				posLeft=-1;
			}
			*/
			if(posLeft==-1 && posRight==-1)
			{
				li.add(-1);
			}
			else if(posLeft==-1 && posRight!=-1)
			{
				li.add(posRight);
			}
			else if(posRight==-1 && posLeft!=-1)
			{
				li.add(posLeft);
			}
			else
			{
				if(Math.abs(pos-posLeft)<=Math.abs(pos-posRight))
				{
					li.add(posLeft);
				}
				else
				{
					li.add(posRight);
				}
				
			}
			
			
		}
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		
	}
	public static void main(String args[])
	{
		List<Integer> li=new ArrayList<Integer>();
		li.add(4);
		li.add(4);
		li.add(1);
		li.add(6);
		li.add(8);
		String s="hackerrank";
		
		
		Solution.closest(s,li);
	}
}
