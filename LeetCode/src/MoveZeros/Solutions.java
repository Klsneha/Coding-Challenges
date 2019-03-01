package MoveZeros;

public class Solutions {
public static void main(String args[]) {
        
	int nums[]= {1,0,3,0,12};
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[j]=nums[i];
                j++;
            }
            
        }
        for(int k=j;k<nums.length;k++)
        {
            nums[k]=0;
        }
    }
}
