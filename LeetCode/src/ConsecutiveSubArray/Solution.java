package ConsecutiveSubArray;

public class Solution {
	
	public static void main(String args[])
	{
		int arr1[]= {1,2,3,2,1};
		int arr2[]= {3,2,1,4,7};
		
		int[][] table=new int[arr1.length+1][arr2.length+1];
		int max=0;
		for(int i=1;i<=arr2.length;i++)
		{
			for(int j=1;j<=arr1.length;j++)
			{
					if(arr1[i-1]==arr2[j-1])
					{
						table[i][j]=table[i-1][j-1]+1;
						if(max<table[i][j])
							max=table[i][j];
					}
			}
		}
		
		System.out.println(max);
		
	}

}
