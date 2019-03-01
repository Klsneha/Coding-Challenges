
public class RemovePunctuations {

	public static void main(String args[])
	{
		String str="%welcome' to @geeksforgeek<s";
		StringBuilder stb=new StringBuilder(str);
		for(int i=0;i<stb.length();i++)
		{
			if((stb.charAt(i)>='A' && stb.charAt(i)<='Z') || (stb.charAt(i)>='a' && stb.charAt(i)<='z') || stb.charAt(i)==' ')
			{
				continue;
			}
			else
			{
				stb.deleteCharAt(i);
			}
		}
		System.out.println(stb.toString());
		
	}
}
