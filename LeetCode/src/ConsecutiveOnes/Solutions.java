package ConsecutiveOnes;

public class Solutions {

public int findMaxConsecutiveOnes(int[] nums) {
        
        int max=0;
        int count=0;
        
        if(nums.length==1)
        {
        	if(nums[0]==1)
        		max=1;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;
                max=count;
            }
            else
            {
               max= Math.max(max, count);
            count=0;	   
            }
            
            
        }
        return max;
    }
	public static void main(String args[])
	{
		Solutions s=new Solutions();
		int A[]= {1,0,1,1,0,1};
		int num=s.findMaxConsecutiveOnes(A);
		System.out.println(num);
	}
}
