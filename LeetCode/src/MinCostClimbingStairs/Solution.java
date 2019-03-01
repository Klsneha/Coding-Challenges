package MinCostClimbingStairs;

public class Solution {

	 public int minCostClimbingStairs(int[] cost) {
		 
		 int[] cal=new int[cost.length];
		 for(int i=0;i<cost.length;i++)
		 {
			 if(i==0)
				 cal[i]=cost[0];
			 else if(i==1)
				 cal[i]=cost[1];
			 else
				 cal[i]=cost[i]+minCost(cal[i-1],cal[i-2]);
			 
		 }
		 return minCost(cal[cost.length-1],cal[cost.length-2]);
		 
        
	 }
	 public int minCost(int num1,int num2)
	 {
		 if(num1<num2)
			 return num1;
		 else
			 return num2;
	 }
	 
	 public static void main(String args[])
	 {
		 Solution s=new Solution();
		 int cost[]= {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		 int res=s.minCostClimbingStairs(cost);
		 System.out.println(res);
	 }
}
