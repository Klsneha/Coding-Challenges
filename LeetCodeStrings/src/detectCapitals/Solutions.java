package detectCapitals;

public class Solutions {

public boolean detectCapitalUse(String word) {
		System.out.println(word.length());
        boolean flag=true;
        if(Character.isUpperCase(word.charAt(0)) &&word.length()>1)
        {
        	if(Character.isUpperCase(word.charAt(1)))
        	{
        		for(int i=2;i<word.length();i++)
        		{
        			if(word.charAt(i)<65 || word.charAt(i)>90)
        			{
        				 flag=false;
        				 break;
        			}
        		}
        	}
        	else {
        		for(int i=2;i<word.length();i++)
        		{
        			if(word.charAt(i)<97 || word.charAt(i)>122)
        			{
        				 flag=false;
        				 break;
        			}
        		}
        	}
        }
        else if(Character.isLowerCase(word.charAt(0)) &&word.length()>1)
        {
        	for(int i=1;i<word.length();i++)
    		{
        		char ch=word.charAt(i);
    			if(word.charAt(i)<97 || word.charAt(i)>122)
    			{
    				 flag=false;
    				 break;
    			}
    		}
        	
        }
        return flag;
    }
	public static void main(String args[])
	{
		Solutions s=new Solutions();
	    String st="ffffffffffffffffffffF";
	   boolean flag= s.detectCapitalUse(st);
	   System.out.println(flag);
	}
}
