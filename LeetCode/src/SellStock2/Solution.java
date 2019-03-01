package SellStock2;

public class Solution {

public int maxProfit(int[] prices) {
        
	int maxPrice=0;
	for(int i=0;i<prices.length;i++)
	{
		for(int j=i+1;j<prices.length;j++)
		{
			if(maxPrice<-prices[i]+prices[j])
			{
				maxPrice=-prices[i]+prices[j];
			}
		}
	}
	return maxPrice;
}


public static void main(String args[])
{
	Solution s=new Solution();
	int prices[]= {7,1,5,3,6,4};
	System.out.println(s.maxProfit(prices));
}
}
