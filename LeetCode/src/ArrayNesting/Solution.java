package ArrayNesting;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

	 public int arrayNesting(int[] nums) {
	        
		 
		 int l=0;
		 int max=0;
		 int size=0;
		 Boolean Visited[]=new Boolean[nums.length];
		 Arrays.fill(Visited, false);
		 while(l<nums.length)
		 {
			 if(Visited[l])
			 {
				 l++;
				 continue;
			 }
			 else
			 {
				 int i=1;
				 ArrayList al = new ArrayList();
				 al.add(nums[l]);
				 int k=nums[l];
				
				 while(i<nums.length)
				 {
					 if(al.contains(nums[k]))
					 {
						 break;
					 }
					 else
					 {
						 Visited[k]=true;
						 al.add(nums[k]);
						 k=nums[k];
						 i++; 
					 }
				 
				 }
				 size=al.size();
				 if(max<size)
				 {
					 max=size;
				 }
				 l++;
			 }
			 
		 }
		 
		 
		
		 return max;
	 }
	 
	 public static void main(String args[])
	 {
		 Solution s=new Solution();
		 int nums[]= {5,4,0,3,1,6,2};
		 System.out.println(s.arrayNesting(nums));
		 
	 }
}
