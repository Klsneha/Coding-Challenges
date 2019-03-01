package longestCommonPrefix;

public class Main {
    public String longestCommonPrefix(String[] strs) {
        int x=strs.length;
        int i=0;
        int j=1;
        int track=0;
        String count="";
        String b=strs[0];
        while(i<b.length())
        {
        	track=0;
          char e = b.charAt(i);
           for(j=1;j<x;j++)
           {
           if(e==strs[j].charAt(i)) 
           {
               track+=1;
           }
           }
             if(track==x-1)
           {
                 count+=b.charAt(i);
                 
           } 
            else
            {
                break;
            }
        i++;        
    }
        return count;
}
    
    public static void main(String args[])
    {
    	Main m=new Main();
    	
    	System.out.println(m.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}