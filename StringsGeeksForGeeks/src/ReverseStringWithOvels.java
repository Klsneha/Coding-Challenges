import java.util.*;
public class ReverseStringWithOvels {
	
	public static void main(String args[])
	{
		String st="sneha";
		ArrayList arr=new ArrayList();
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)=='a' || st.charAt(i)=='e'||st.charAt(i)=='o'||st.charAt(i)=='i'||st.charAt(i)=='u')
			{
				arr.add(i);
			}
		}
		StringBuilder stb=new StringBuilder(st);
		stb=stb.reverse();
		StringBuilder final1=new StringBuilder();
		System.out.println(arr.size());
		for(int j=0;j<stb.length();j++)
		{
			if(arr.contains((int)j))
			{
				continue;
			}
			else
			{
				final1.append(stb.charAt(j));
			}
		}
		
		System.out.println(final1);
	}
}
