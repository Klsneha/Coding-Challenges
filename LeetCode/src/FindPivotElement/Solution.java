package FindPivotElement;

public class Solution {

	public int pivotIndex(int[] nums) {
		int rSum =0;
		for(int i=0;i<nums.length;i++) rSum += nums[i];
		
		int lSum=0;
		for(int i=0;i<nums.length;i++)
		{
			if(lSum==rSum-lSum-nums[i])
			{
				return i;
			}
			else
			{
				lSum=lSum+nums[i];
			}
		}
		return -1;

		
	}
	 
	 public static void main(String args[])
	 {
		 Solution s=new Solution();
		 int a[]= {1,7,3,6,5,6};
		 int k=s.pivotIndex(a);
		 System.out.println(k);
	 }
}
