package Assignmnet;

public class MostRepeatedCharacter {

	public static void main(String args[])
	{
		String str="Diffficut";
		MostRepeatedCharacter mrc=new MostRepeatedCharacter();
		mrc.RepeatedCharacter(str);
		
	}
	public void RepeatedCharacter(String str)
	{
		char highcount = 0;
		for(int i=0;i<str.length();i++)
		{
			char alpha=str.charAt(i);
			
			int count=0;
			int max=2;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(j)==alpha)
				{
					count=count+1;
				}
			}
			if(count>1)
			{
				if(count>max)
				{
					max=count;
					highcount=alpha;
				}
			}
		}
		System.out.println("Highest count is"+highcount);
	}
}
