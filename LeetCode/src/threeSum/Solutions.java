package threeSum;
import java.util.*;
public class Solutions {

	public List<List<Integer>> threeSum(int[] nums) {
        
       
        Set<List> s=new HashSet<List>();
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
       
     //   System.out.println(nums.length);
        for(int i=0;i<nums.length-2;i++)
        {
        	int j=i+1;
        	int k=nums.length-1;
        	while(j<k)
        	{
        		int sum=nums[i]+nums[j]+nums[k];
        		if(nums[i]+nums[j]+nums[k]==0)
        		{
        			List<Integer> li=new ArrayList<Integer>();
        			li.add(nums[i]);
        			li.add(nums[j]);
        			li.add(nums[k]);
        			s.add(li);
        			j++;
        			k--;
        		}
        		else if(nums[i]+nums[j]+nums[k]<0)
        		{
        			j++;
        		}
        		else if(nums[i]+nums[j]+nums[k]>0)
        		{
        			k--;
        		}
        	}
        	
        }
Iterator it = s.iterator(); 
        
        // Display element by element using Iterator 
        while (it.hasNext()) 
        {
           // System.out.println(it.next()); 
        list.add((List) it.next());
        }
        return list;
    }
	
	public static void main(String args[])
	{
		Solutions s=new Solutions();
		int nums[]= {-1,0,1,2,-1,-4};
		//int nums[]= {-2,0,1,1,2};
		//int nums[]= {0,0,0};
		List li=s.threeSum(nums);
		Iterator it=li.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	
}
