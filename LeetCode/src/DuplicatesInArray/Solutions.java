package DuplicatesInArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solutions {
	
	 public List<Integer> findDuplicates(int[] nums) {
	        
		 	List<Integer> li=new ArrayList<Integer>();
	        /*Arrays.sort(nums);
	        for(int i=0,j=1;i<nums.length&j<nums.length;i++,j++)
	        {
	        	if(nums[i]==nums[j])
	        	{
	        		li.add(nums[i]);
	        	}
	        }
			return li;*/
		 	/*for(int i=0;i<nums.length;i++)
		 	{
		 		for(int j=i+1;j<nums.length;j++)
		 		{
		 			if(nums[i]==nums[j])
		 			{
		 				li.add(nums[i]);
		 				break;
		 			}
		 		}
		 	}*/
		 	int i=0;
		 	while(i<nums.length)
		 	{
		 		int num1=nums[i];
		 		if(num1!=i+1 && num1!=-1)
		 		{
		 			int loc=nums[i]-1;
		 			int num2=nums[loc];
		 			if(num1!=num2)
		 			{
		 				int temp=nums[i];
		 				nums[i]=nums[loc];
		 				nums[loc]=temp;
		 			}
		 			else {
		 				li.add(nums[i]);
		 				nums[i]=-1;
		 				i++;
		 			}
		 		}
		 		else
		 		{
		 			i++;
		 		}
		 		
		 	}
		 	
		 	for(int j=0;j<nums.length;j++)
		 	{
		 		System.out.println(nums[j]);
		 	}
		 	
	        return li;
	    }
	    public void swap(int a, int b)
	    {
	    	int temp=a;
	    	a=b;
	    	b=temp;
	    }
	 	public static void main(String args[])
	 	{
	 		Solutions s=new Solutions();
	 		int[] arr= {4,3,2,7,8,2,3,1};
	 		List li=s.findDuplicates(arr);
	 		System.out.println("list");
	 		for(int i=0;i<li.size();i++)
	 		{
	 			System.out.println(li.get(i));
	 		}
	 		
	 	}

}
