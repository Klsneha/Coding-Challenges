package KthLargestElement;

import java.util.*;

public class Colution {

public int findKthLargest(int[] nums, int k) {
	
	PriorityQueue<Integer> q=new PriorityQueue<Integer>();
	int i=0;
	while(i<nums.length)
	{
		q.add(nums[i]);
		if(q.size()>k)
		{
			q.remove();
		}
		i++;
			
	}
	
	return q.remove();
        
    }
public static void main(String[] args) {
	Colution c=new Colution();
	int nums[]= {3,2,1,5,6,4,1};
	int a=8;
	//a++;
	System.out.println(Math.pow(2, 32));
	System.out.println(c.findKthLargest(nums, 2));
 }
}