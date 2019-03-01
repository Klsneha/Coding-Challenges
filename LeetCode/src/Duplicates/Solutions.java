package Duplicates;
import java.util.*;
public class Solutions {

	
	    public boolean containsDuplicate(int[] nums) {
	        
	        Set<Integer> s=new HashSet<Integer>();
	        int i=0;
	        while(i<nums.length)
	        {
	            s.add(nums[i]);
	            i++;
	        }
	        System.out.println(s.size());
	        System.out.println(nums.length);
	        if(s.size()==nums.length)
	        {
	            return false;
	        }
	        else
	        {
	            return true;
	        }
	        
	    }
	
	public static void main(String args[])
	{
		Solutions s=new Solutions();
		int a[]= {1,2,3,1};
		boolean flag=s.containsDuplicate(a);
		System.out.println(flag);
	}
}
