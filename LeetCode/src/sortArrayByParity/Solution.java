
package sortArrayByParity;
import java.util.*;
public class Solution {
	
	 public int[] sortArrayByParity(int[] A) {
		 int odd=0;
		 int temp=0;
		 int flag=0;
		 for(int i=0;i<A.length;i++)
		 {
			 if(A[i]%2!=0)
			 {
				 if(flag==1)
				 {
					 if(A[odd]%2!=0)
						 continue;
					 else
						 odd=i;
				 }
			 }
			 else
			 {
				 temp=A[i];
				 A[i]=A[odd];
				 A[odd]=temp;
				 odd++;
				 flag=1;
			 }
		 }
		 return A;
		 
	    }
	 
	    public static void main(String args[])
	    {
	    	Solution s=new Solution();
	    	int a[]= {2,1,4,3,6,7,8,9};
	    	int temp[]=s.sortArrayByParity(a);
	    	for(int i=0;i<temp.length;i++)
	    	{
	    		System.out.println(temp[i]);
	    	}
	    	
	    }

}
