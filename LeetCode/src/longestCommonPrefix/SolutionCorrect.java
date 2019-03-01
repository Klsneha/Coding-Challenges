package longestCommonPrefix;

import java.util.Arrays;

public class SolutionCorrect {
	
	

	public String longestCommonPrefix(String[] strs) {
		/*boolean check=false;
		for(int k=0;k<strs.length;k++)
		{
			if(strs[k].length()==1)
			{
				check=true;
				break;
			}
		}
		if(check)*/
			//Arrays.sort(strs);
		boolean flag=false;
	    if (strs.length == 0) return "";
	    String prefix = strs[0];
	    for (int i = 1; i < strs.length; i++)
	    {
	    	  flag = false;
	       while(strs[i].indexOf(prefix)==-1)
	       {
	    	  
	    		   prefix=prefix.substring(0,prefix.length()-1);
	       }
	       
	    }
	    return prefix;
	}
	
	public static void main(String args[])
	{
		SolutionCorrect s=new SolutionCorrect();
		String strs[]= {"ca","a"};
		String st=s.longestCommonPrefix(strs);
		System.out.println(st);
		
	}
}
