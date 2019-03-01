package RemoveDuplicatesFromArray;
import java.util.*;
public class Solution {
public int removeDuplicates(int[] nums) {
	
	int i=0;
	for(int j=1;j<nums.length;j++)
	{
		if(nums[j]!=nums[i]) {
			i++;
			nums[i]=nums[j];
		}
			
			
	}
	return i+1;
        
    }
public static void main(String args[])
{
	int arr[]= {1,1,2,2,3,3,4,5,6,6};
	Solution s=new Solution();
	int count=s.removeDuplicates(arr);
	System.out.println(count);
}


}
