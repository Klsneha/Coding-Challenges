package RotateArray;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

public int[] rotate(int[] nums, int k) {
        
	Deque<Integer> q=new LinkedList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            q.add(nums[i]);
        }
        
        for(int i=0;i<k;i++)
        {
            int num=q.removeLast();
            q.addFirst(num);
        }
        
        for(int i=0;i<nums.length;i++)
        {
        	nums[i]=q.remove();
        }
        return nums;
    }

public static void main(String args[])
{
	int arr[]= {1,2,3,4,5,6,7};
	int k=3;
	Solution s=new Solution();
	int nums[]=s.rotate(arr, k);
	for(int i=0;i<nums.length;i++)
	{
		System.out.print	(nums[i]);
	}
}
}
