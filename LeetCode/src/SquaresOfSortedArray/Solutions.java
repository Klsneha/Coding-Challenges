package SquaresOfSortedArray;

import java.util.Arrays;
class Solution {
	
    public int[] sortedSquares(int[] A) {
    	
    	
		int sol[]=new int[A.length];
    	int j=0;
    	int i=0;
    	
    	if(A.length==1)
        {
            A[0]=A[0]*A[0];
            return A;
        }
    	while(j<A.length)
    	{
    		if(A[j+1]>=0)
    			break;
    		else
    			j++;
    	}
    	
    	i=j+1;
    	int k=0;
    	while(j>=0 && i<A.length)
    	{
    		if(A[i]*A[i]>=A[j]*A[j])
        	{
        		sol[k]=A[j]*A[j];
        		j--;
        		k++;
        	}
    		else
    		{
    			sol[k]=A[i]*A[i];
    			i++;
    			k++;
    		}
    	}
    	
    	while(i!=A.length)
    	{
    		
    			sol[i]=A[i]*A[i];
    			i++;
    		
    	}
    	
    	while(j>=0)
    	{
    		
    			sol[k]=A[j]*A[j];
    			k++;
    			j--;
    		
    	}
    	
    	
    	
    	
    	return sol;
        
       
    }
    
    public static void main(String args[])
    {
    	Solution s=new Solution();
    	int a[]= {-4,-1,0,3,10};
    	int sol[]=s.sortedSquares(a);
    	for(int i=0;i<sol.length;i++)
    	{
    		System.out.println(sol[i]);
    	}
    }
}

