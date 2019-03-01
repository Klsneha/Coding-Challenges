package copyArray;

import java.util.Arrays;

public class ArrayCopyDemo {
	
	int a[]= {1,2,3,4,5};
	public void copy()
	{
		int b[]=Arrays.copyOf(a, 5);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
	public static void main(String args[])
	{
		ArrayCopyDemo arr=new ArrayCopyDemo();
		arr.copy();
	}
}
