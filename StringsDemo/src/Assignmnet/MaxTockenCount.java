package Assignmnet;

public class MaxTockenCount {
	public static void main(String args[])
	{
		String str="java is a programming language. java It is mostly used in big data java applications";
		String[] arr=str.split(" ");
		String maxStr="";
		int max=0;
		
		for(int i=0;i<arr.length;i++)
		{
			
			
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				
				if(arr[i].equals(arr[j]))
				{
					
					count=count+1;
				}
			}
			//System.out.println("word count "+ arr[i]+"  "+ count);
			if(count>1)
			{
			if(count>max)
			{
				max=count;
				maxStr=arr[i];
			}
			}
		}
		System.out.println("Tocken String "+ maxStr+" count "+ max);
		
	}

}
