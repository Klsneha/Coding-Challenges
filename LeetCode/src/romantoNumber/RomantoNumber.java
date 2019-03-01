package romantoNumber;
import java.util.*;
public class RomantoNumber {
	
	public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<Character, Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        Integer result=0;
        
      int  len=s.length();
      for(int i=0,j=i+1;i<len&&j<len;i++,j++)
      {
    	  System.out.println("char at"+i+" "+s.charAt(i));
    	  System.out.println("char at"+j+" "+s.charAt(j));
    	  if(map.get(s.charAt(i))>=map.get(s.charAt(j))) {
    		   result = result+map.get(s.charAt(i));
    		   System.out.println("result"+result);
    	  }
    	  else
    	  {
    		  result=result-map.get(s.charAt(i));
    		  System.out.println("result"+result);
    	  }
    	 
    		  
      }
      result=result+map.get(s.charAt(len-1));
        System.out.println("the value is"+result);
        return result;
    }
	
	public static void main(String args[])
	{
		RomantoNumber r=new RomantoNumber();
		//String s="MCMXCIV";
		//String s="LVIII";
		String s="III";
		r.romanToInt(s);
	}

}
