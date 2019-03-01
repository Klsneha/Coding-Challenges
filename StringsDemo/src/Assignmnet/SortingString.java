package Assignmnet;

import java.util.Arrays;

public class SortingString {

	public static void main(String args[])
	{
		String str="sneha";
		SortingString ss=new SortingString();
		ss.sorting(str);
		
	}
	public void sorting(String str)
	{
		int[] arr=new int[str.length()];
		for(int i=0;i<str.length();i++)
		{
			arr[i]=(int)str.charAt(i);
			System.out.println(arr[i]+" "+str.charAt(i));
		}
		arr=sort(arr);
		String finalstr="";
		for(int k=0;k<arr.length;k++)
		{
			finalstr=finalstr+(char)arr[k];
		}
		System.out.println("Sorted string is"+finalstr);
		
		
	}
	
	public int[] sort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		return arr;
	}
	
}
