package Assignmnet;

public class Palindrome {
	public static void main(String args[])
	{
		String str="level";
		String strReverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			strReverse=strReverse+str.charAt(i);
		}
		System.out.println("Temporary string is"+strReverse);
		if(str.equals(strReverse))
		//if(str==strReverse)compares objects
		{
			System.out.println("The String is a Palindrome");
		}
		else
		{
			System.out.println("the String is not a palindrome");
		}
	}

}
