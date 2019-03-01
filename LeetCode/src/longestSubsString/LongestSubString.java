package longestSubsString;

public class LongestSubString {

public int lengthOfLongestSubstring(String s) {
	String str="";
	int flag=0;
     for(int i=0;i<s.length();i++)
     {
    	 for(int j=0;j<s.length();j++)
    	 {
    		 if(i!=j)
    		 {
    		
				if(s.charAt(i)==s.charAt(j))
				{
					System.out.println(i+" "+j);
					str=s.substring(i,j);
					System.out.println(str);
					flag=1;
				}
				 break;		 
    		 }
    		
    		
    	 }
    	if(flag==1)
    		break;
     }
	
	return str.length();
    }

public static void main(String args[])
{
	LongestSubString s=new LongestSubString();
	String str="abcabcbb";
	s.lengthOfLongestSubstring(str);
	//System.out.println(s.lengthOfLongestSubstring(str));
}
}
