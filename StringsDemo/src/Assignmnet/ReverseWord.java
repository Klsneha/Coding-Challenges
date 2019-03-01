package Assignmnet;

public class ReverseWord {

	public static void main(String args[])
	{
		String str="Sneha is a good girl";
		ReverseWord rw=new ReverseWord();
		rw.Reversing(str);
		
	}
	
	public void Reversing(String str)
	{
		/*String temp="";
		String str1=str;
		for(int i=str.length()-1;i>0;i--)
		{
			
			if(str.charAt(i)==' ')
			{
				temp=temp+str1.substring(i+1,str1.length());
				System.out.println("Main strings "+temp);
				str1=str1.substring(0,i);
				System.out.println("Using string "+str1);
				temp=temp.concat(" ");
				
				
			}
		}
		temp=temp+str1;
		
		System.out.println("final "+temp);*/
		
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		StringBuilder stb=new StringBuilder();
		for(int i= arr.length-1;i>=0;i--)
		{
			stb=stb.append(arr[i]);
		}
		System.out.println(stb.toString());
		
	}
}
