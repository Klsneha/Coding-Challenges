
package assignment4q4;
import java.io.*;
import java.util.*;

public class OddOccurances {
	
	public int counting(int[] arr)
	{
		int retunValue=0;
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			int count=0;
			ArrayList<Integer> arrli = new ArrayList<Integer>();
			if(arrli.contains(num))
			{
				continue;
			}
			for(int j=0;j<arr.length;j++)
			{
				if(num==arr[j])
					count=count+1;
			}
			arrli.add(num);
			if(count%2!=0)
			{
				 retunValue=num;;
			}
		}
		return retunValue;
	
	}
	
	public static void main(String args[])
	{
		int arr[]= {3,2,3,2,3,3,4,4,4};
		OddOccurances o=new OddOccurances();
		int oddValue=o.counting(arr);
		System.out.println("The Odd Occured Value is"+oddValue);
		
	}

}
