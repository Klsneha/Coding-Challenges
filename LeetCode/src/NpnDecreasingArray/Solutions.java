package NpnDecreasingArray;

public class Solutions {

	 public boolean checkPossibility(int[] nums) {
	        boolean modified=false;
	        for (int i=0;i<nums.length-1;i++) {
	            if (nums[i]>nums[i+1]) {
	                if (modified) {
	                    return false;
	                }
	                // mark as modified
	                modified=true;
	                if (i>0&&nums[i-1]>nums[i+1]) {
	                    // could be fixed with modifying nums[i+1] to nums[i]
	                    nums[i+1]=nums[i];
	                } else {
	                    // could be fixed with modifying nums[i] to nums[i+1], just move on    
	                }
	            }
	        }
	        return true;
	    }
	    
	 	public static void main(String args[])
	 	{
	 		Solutions s=new Solutions();
	 		int a[]= {3,4,2,3};
	 		boolean flag=s.checkPossibility(a);
	 		System.out.println(flag);
	 		
	 	}
}
