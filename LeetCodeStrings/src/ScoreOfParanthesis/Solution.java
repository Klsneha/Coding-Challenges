package ScoreOfParanthesis;

import java.util.*;

public class Solution {

public int scoreOfParentheses(String S) {
        
	Stack<Character> st=new Stack<Character>();
	HashMap<Character,Character> map=new HashMap<Character,Character>();
	map.put(')','(');
	char r;
	boolean flag=false;
	int count=1;
	int res=0;
	
	for(int i=0;i<S.length();i++)
	{
		if(S.charAt(i)==')')
		{
			if(flag)
			{
				r=st.pop();
				count=count*2;
			}
			else
			{
				r=st.pop();
				flag=true;
				res=res+count;
			}
				
			
		}
		else
		{
			st.push(S.charAt(i));
			flag=false;
		}
	}
	return count;
	
    }
public static void main(String[] args) {
	
	Solution s=new Solution();
	String st="(()(()))";
	System.out.println(s.scoreOfParentheses(st));
	
}
}
