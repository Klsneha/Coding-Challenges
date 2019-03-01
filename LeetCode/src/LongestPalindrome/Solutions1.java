package LongestPalindrome;

public class Solutions1 {


	    public String longestPalindrome(String s) {
	        
	        int max=0;
	        String finalReturn="";
	        String str="";
	        if(isPalindrome(s))
	            return s;
	        for(int i=0;i<s.length();i++)
	        {
	            for(int j=i+1;j<=s.length();j++)
	            {
	              str=s.substring(i,j);
	                if(isPalindrome(str))
	                {
	                    int len=str.length();
	                    if(len>max)
	                    {
	                        max=len;
	                        finalReturn=str;
	                    }
	                    
	                }
	                else
	                    continue;
	                
	                
	                    
	            }
	        }
	        return finalReturn;
	        
	    }
	    
	    public boolean isPalindrome(String st)
	    {
	        StringBuilder stb=new StringBuilder(st);
	        String reverseSt=stb.reverse().toString();
	        if(reverseSt.equals(st))
	        {
	            return true;
	        }
	        else
	        {
	            return false;
	        }
	    }
	
	
	public static void main(String args[])
	{
		String st="ababababcd";
		Solutions1 s=new Solutions1();
		String so=s.longestPalindrome(st);
		System.out.println(so);
		
		
	}
}
