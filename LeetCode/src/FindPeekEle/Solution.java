package FindPeekEle;

public class Solution {
	
public int findPeakElement(int[] nums) {
	int max=0;
	for(int i=1;i<nums.length;i++)
	{
		if(nums[i]>nums[i-1])
			max=i;
			
	}
	return max;
}

public static void main(String[] args) {
	Solution s=new Solution();
	int arr[]= {1,2,1,3,5,6,4};
	System.out.println(s.findPeakElement(arr));
}

}
