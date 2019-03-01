package ReverseAString;
import java.util.*;
public class Solutions {

	public String reverseWords(String s) {
       /* Stack<Character> stack = new Stack<Character>(); 
        String output=new String();
        s=s+' ';
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                stack.push(s.charAt(i));
            }
            else
            {
            	int n=stack.size();
                for(int j=0;j<n;j++)
                {
                    output=output+(stack.pop());
                }
                output=output+' ';
            }
        }
        return output=output.substring(0,output.length()-1);*/
		 char[] a = s.toCharArray();
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println(a[i]);
		 }
		String arr[]=s.split(" ");
		String str=new String();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=arr[i].length()-1;j>=0;j--)
			{
				str=str+(arr[i].charAt(j));
			}
			str=str+' ';
		}
		return str=str.substring(0,str.length()-1);
        
    }
	public static void main(String args[])
	{
		Solutions s=new Solutions();
		String res=s.reverseWords("Hello Sneha");
		System.out.println(res);
	}
}
