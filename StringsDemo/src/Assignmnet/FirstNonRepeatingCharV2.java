package Assignmnet;

public class FirstNonRepeatingCharV2 {
	public static void main(String args[])
	{
		String str="kandukuri";
		FirstNonRepeatingCharV2 fn=new FirstNonRepeatingCharV2();
		fn.Repeating(str);
	}
	
	public void Repeating(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			
			char alpha=str.charAt(i);
			int count=0;
			for(int j=0;j<str.length();j++)
			{
				if(alpha==str.charAt(j))
				{
					
					count=count+1;
				}
				
			}
			if(count>1)
			{
				
				str=str.replace(alpha,'_');
			}
			
		}
		System.out.println("Final str"+str);
		for(int k=0;k<str.length();k++)
		{
			if(str.charAt(k)!='_')
			{
				System.out.println(str.charAt(k));
				break;
			}
				
		}
	}

}
