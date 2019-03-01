package longestCommonPrefix;

import java.util.Arrays;

public class VerticalApproach {

	public String longestCommonPrefix(String[] strs) {
	
		Arrays.sort(strs);
		String startStr=strs[0];
		int x=0;
		String prefix="";
		int len=startStr.length();
		int count=0;
		while(x<len)
		{
			count=0;
			for(int i=1;i<strs.length;i++)
			{
				if(startStr.charAt(x)==strs[i].charAt(x))
				{
					count=count+1;
				}
			}
			if(count==strs.length-1)
				prefix=prefix+startStr.charAt(x);
			else
				break;
			x++;
		}
		//System.out.println("prefix");
		return prefix;
	}
	
	public static void main(String args[])
	{
		VerticalApproach s=new VerticalApproach();
		String strs[]= {"flower","flow","flight"};
		System.out.println(s.longestCommonPrefix(strs));
	}
}
