package SortArrayByParity2;

public class Solution {
	
public int[] sortArrayByParityII(int[] A) {
        
	for(int i=0;i<A.length;i++)
	{
		if(i%2==0 && A[i]%2==0)
			continue;
		else if(i%2==0 && A[i]%2!=0)
		{
			int j=i+1;
			while(j<A.length)
			{
				if(A[j]%2!=0)
				{
					j=j+2;
					continue;
				}
				else
				{
					int temp=A[i];
					A[i]=A[j];
					A[j]=temp;
					break;
				}
			}
		}
		else if(i%2!=0 && A[i]%2==0)
		{
			int j=i+1;
			while(j<A.length)
			{
				if(A[j]%2==0)
				{
					j=j+2;
					continue;
				}
				else
				{
					int temp=A[i];
					A[i]=A[j];
					A[j]=temp;
					break;
				}
			}
			

		
		}
	}
	
	return A;
}

public static void main(String args[])
{
	Solution s=new Solution();
	int A[]= {4,2,5,7};
	int arr[]=s.sortArrayByParityII(A);
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}

}
