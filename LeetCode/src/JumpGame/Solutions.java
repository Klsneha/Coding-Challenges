package JumpGame;

public class Solutions {

public boolean canJump(int[] nums) {
        
        int i=0;
        boolean flag=true;
        int previ=nums.length;
         while(i<nums.length)
         {
             if(i==nums.length-1)
             {
                 flag=true;
                 break;
             }
             if(i==previ)
             {
                 flag=false;
                 break;
             }
             previ=i;
             i=i+nums[i];   
             
         }
        return flag;
    }
	public static void main(String args[])
	{
		Solutions s=new Solutions();
		int nums[]= {2,5,0,0};
		boolean flag=s.canJump(nums);
		System.out.println(flag);
		
	}
}
