package IntersectionOfElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Solutions {

public int[] intersection(int[] nums1, int[] nums2) {
		
	
	Set<Integer> h = new HashSet<Integer>();
        for(int i=0;i<nums1.length;i++)
        {
        	for(int j=0;j<nums2.length;j++)
        	{
        		if(nums1[i]==nums2[j])
        		{
        			h.add(nums1[i]);
        		}
        	}
        }
        
        System.out.println(h);
        
        int result[]=new int[h.size()];
        int i = 0; 
        for (int x : h) 
            result[i++] = x; 
        return result;
        
        
    }

	public static void main(String args[])
	{
		Solutions s=new Solutions();
		int nums1[]= {1,2,2,1};
		int nums2[]= {1,2,2};
		int result[]=s.intersection(nums1, nums2);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
		
	}
}
