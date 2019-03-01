package assignment1q6;
import java.io.*;
import java.util.*;
public class DuplicateElement {
	
	public ArrayList<Integer> Duplicatevalues(int[] arr)
	{
		ArrayList<Integer> arrli = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			int count=0;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					
				}
				
			}
			if(count>1)
			{
				arrli.add(arr[i]);
			}
		}
		return arrli;
		
		
	}
	public static void main(String args[])
	{
		int[] arr= {2,3,4,5,2,5,6,4,6};
		DuplicateElement d=new DuplicateElement();
		ArrayList<Integer> arrli = new ArrayList<Integer>();
		arrli=d.Duplicatevalues(arr);
		for(int i=0;i<arrli.size();i++)
		{
			System.out.println("Duplicate values are"+arrli.get(i));
		}
		
		
	}

}
