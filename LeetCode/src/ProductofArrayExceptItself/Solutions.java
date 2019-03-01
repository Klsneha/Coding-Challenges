package ProductofArrayExceptItself;

public class Solutions {

public int[] productExceptSelf(int[] nums) {
        
        int[] output=new int[nums.length];
        int[] res1=new int[nums.length];
        int[] res2=new int[nums.length];
        res1[0]=1;
        res2[nums.length-1]=1;
        
        for(int i=0;i<res1.length;i++)
        {
            if(i>0)
            {
                res1[i]=res1[i-1]*nums[i-1];
            }
        }
        output[nums.length-1]=res1[nums.length-1];
        
        for(int j=res2.length;j>=0;j--)
        {
        	if(j<nums.length-1)
        	{
        		res2[j]=res2[j+1]*nums[j+1];
        		output[j]=res1[j]*res2[j];
        	}
        }
        
        for(int i=0;i<nums.length;i++)
        {
          // output[i]=res1[i]*res2[i];
           System.out.println(output[i]);
        }

        return res1;
    }

	public static void main(String args[])
	{
		Solutions s=new Solutions();
		int nums[]= {1,2,3,4};
		int[] res=s.productExceptSelf(nums);
	}
}
