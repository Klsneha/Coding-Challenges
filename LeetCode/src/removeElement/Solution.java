package removeElement;


public class Solution {

public int removeElement(int[] nums, int val) {
	
	
	int i=0;
	for(int j=0;j<nums.length;j++)
	{
		if(nums[j]!=val)
		{
			nums[i]=nums[j];
					i++;;
					
		}
			
	}
	return i;
	
        
    }
public static void main(String args[])
{
	int arr[]= {3,2,2,3};
	int val=3;
	Solution s=new Solution();
	int count=s.removeElement(arr,val);
	System.out.println("********");
	System.out.println(count);
}

}
