package MajorityElement;
import java.util.*;
import java.util.Map.Entry;
public class Solutions {
	public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
            	int count=map.get(nums[i])+1;
            	map.put(nums[i],count);
            }
            else
            {
            	map.put(nums[i],1);
            }
        }
      //  printMap(map);
        int key=0;
        int max=0;
        
        Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator(); 
		while(itr.hasNext())
		{
			Entry<Integer, Integer> entry = itr.next(); 
			if (entry.getValue()/2>max) {
                max=entry.getValue()/2;
                key=entry.getKey();
            }
		}
        return key;
        
        
        
    }
	
	/*public static void printMap(Map mp) {
	    Iterator it = mp.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue());
	        it.remove(); // avoids a ConcurrentModificationException
	    }
	}*/
	public static void main(String args[])
	{
		int nums[]= {2,2,1,1,1,2,2};
		Solutions s=new Solutions();
		int num=s.majorityElement(nums);
		System.out.println(num);
	}
}
