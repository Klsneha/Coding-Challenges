package Assignmnet;

public class FirstNonRepeatingChar {

	public static void main(String args[])
	{
		String str="ravindra";
		FirstNonRepeatingChar fr=new FirstNonRepeatingChar();
		fr.NonRepatingChar(str);
		
	}
	
	public void NonRepatingChar(String str)
	{
		/*char alpha=' ';
		for(int i=0;i<str.length();i++)
		{
			 alpha=str.charAt(i);
			int count=0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(j)==alpha)
				{
					count=count+1;
				}
			}
			if(count>1)
			{

				alpha=str.charAt(i+1);
				break;
			}
		}
		System.out.println("final "+ alpha);*/
		
		for(int i=0;i<str.length();i++)
		{
			boolean flag=true;
			
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{	flag=false;
					break;
				}
			}
			if(flag)
			{
			System.out.println(str.charAt(i));
				break;
			}
		}
		
	}
}
