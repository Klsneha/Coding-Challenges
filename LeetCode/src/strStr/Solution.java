package strStr;

public class Solution {

	public int strStr(String haystack, String needle) {
	       
        String temp;
        int index=-1;
        //int len=needle.length();
        int len=needle.length();
        if(needle.length()==0&&haystack.length()==0)
        	return 0;
        if(len==0)
            return index;
        if(haystack.length()<needle.length())
            return index;
        for(int j=0;j<haystack.length();j++)
        {
            if(haystack.charAt(j)==needle.charAt(0))
            {
            	if(haystack.substring(j).length()>=needle.length())
            	{
                temp=haystack.substring(j,j+len);
                if(needle.equals(temp))
                {
                    index= j;
                    break;
                }
            	}
            }
        }
        return index;
            
        
    }
    public static void main(String args[])
    {
        String haystack="mississippi";
        String needle="issipi";
        
        Solution s=new Solution();
        int index=s.strStr(haystack,needle);
        System.out.println(index);
    }
}
