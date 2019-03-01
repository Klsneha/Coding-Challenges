import java.util.Stack;

public class ReverseString {

	public static void main(String args[])
	{
		String st="20-3+5*2"; 
		Stack s=new Stack();
		String temp=new String();
		boolean flag=false;
		for(int i=0;i<st.length();i++)
		{
			System.out.println(st.charAt(i));
			if(st.charAt(i)!='-'&& st.charAt(i)!='+'&&st.charAt(i)!='*'&&st.charAt(i)!='/')
			{
				
				temp=temp+(st.charAt(i));
				
			}
			else
			{
				s.push(temp);
				temp="";
				s.push(st.charAt(i));
				
			}
			
			
		}
		StringBuilder stb=new StringBuilder();
		
		System.out.println(s);
				
	}
}
