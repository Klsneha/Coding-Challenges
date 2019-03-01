package containerWithMostWater;

public class Solutions {

	public int maxArea(int[] height) {
		
		int l=0;
		int r=height.length-1;
		int area=0;
		int maxArea=0;
		while(l<r)
		{
			area=Math.min(height[l], height[r])*(r-l);
			if(maxArea<area)
			{
				maxArea=area;
			}
			if(height[l]<height[r])
			{
				l++;
			}
			else
			{
				r--;
			}
		}
		return maxArea;
	}
	public static void main(String args[])
	{
		Solutions s=new Solutions();
		int ht[]= {1,8,6,2,5,4,8,3,7};
		int num=s.maxArea(ht);
		System.out.println(num);
	}
}
