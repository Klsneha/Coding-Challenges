
public class reverseVowels {

	public static void main(String args[])
	{
		String s="Hello World";
		StringBuilder stb=new StringBuilder();
		
		for(int i=0;i<s.length();i++)
		{
			if(isVowel(s.charAt(i)))
			{
				stb.append(s.charAt(i));
			}
		}
		System.out.println(stb);
		stb=stb.reverse();
		int j=0;
		StringBuilder stb1=new StringBuilder(s);
		System.out.println(stb);
		for(int i=0;i<stb1.length();i++)
		{
			if(isVowel(s.charAt(i)))
			{
				
				stb1.setCharAt(i,stb.charAt(j));
				j++;
			}
		}
		System.out.println(stb1.toString());
		
		
		
	}
	
	public static boolean isVowel(char a)
	{
		boolean flag=false;
		if(a=='a'|| a=='e' || a=='i' || a=='o' || a=='u')
		{
			flag=true;
		}
		return flag;
	}
}
