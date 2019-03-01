package MinInSortedArray;

public class Solution {
	
public int findMin(int[] nums) {
        
		int j=nums.length-1;
		int i=0;
		int min=nums[i];
		while(i<nums.length && j>=0)
		{
			if(min<nums[j])
				return min;
			if(nums[j]<min)
			{
				min=nums[j];
				j--;
			}
				
		}
		return min;
    }
public static void main(String[] args) {
	Solution s=new Solution();
	int nums[]= {4,5,6,7,0,1,2};
	int index=s.findMin(nums);
	System.out.println(index);
}

}
