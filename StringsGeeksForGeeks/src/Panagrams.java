import java.util.Arrays;

public class Panagrams {

	public static void main(String args[])
	{
		String str="The quick brown fox jumps over the dog";
		boolean mark[]=new boolean[26];
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				int index=str.charAt(i)-'A';
				mark[index]=true;
			}
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				int index=str.charAt(i)-'a';
				mark[index]=true;
			}
			
		}
		for(int i=0;i<mark.length;i++)
		{
			if(mark[i]==false)
			{
				//int count='a';
				System.out.println((char)(i+'a'));
				//System.out.println((char) ((char) count+i)); 
				
			}
		}
		
	}
}
