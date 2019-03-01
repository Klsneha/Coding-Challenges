package paranthesis;
import java.util.*;
public class ValidParanthesis {
	 public boolean isValid(String s) {
	        
	        HashMap<Character,Character> map=new HashMap<Character,Character>();
	        
	        
	        map.put(')','(');
	        map.put(']','[');
	        map.put('}','{');
	        map.put('"','"');
	        
	        Stack<Character>  st=new Stack<Character>();
	        boolean flag=false;
	        if(s.length()==0)
	        	return true;
	        try {
	        	
	        for(int i=0;i<s.length();i++)
	        {
	            if(s.charAt(i)=='('|| s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='"')
	                st.push(s.charAt(i));
	            else if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']'||s.charAt(i)=='"')
	            {
	               char out=st.pop();
	                if(map.get(s.charAt(i))==out)
	                {
	                	flag=true;
	                	
	                }
	                else
	                {
	                	flag=false;
	                	break;
	                }
	                	
	            }
	            
	                                               
	        }
	        
	        }catch(EmptyStackException e)
	        {
	        	return false;
	        }
	       if(st.isEmpty())
	    	   return flag;
	       else
	    	   return false;
	    }
	 
	 public static void main(String args[])
	 {
		 String str= "([]";
		 
		 ValidParanthesis s=new ValidParanthesis();
		 System.out.println(s.isValid(str));
	 }
}
