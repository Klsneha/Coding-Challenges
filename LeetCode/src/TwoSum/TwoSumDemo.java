package TwoSum;

public class TwoSumDemo {

	public int[] twoSum(int[] num, int target)
	{
		int[] indices=new int[2];
		int flag=0;
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num.length;j++)
			{
				if(i!=j)
				{
					int sum=num[i]+num[j];
					if(sum==target)
					{
						indices[0]=i;
						indices[1]=j;
						flag=1;
						break;
					}
				}
			}
			if(flag==1)
			break;
		}
		return indices;
	}
	
	public static void main(String args[])
	{
		int[] num= {2,7,11,15};
		int[] indices=new int[2];
		int target=13;
		TwoSumDemo t=new TwoSumDemo();
		indices=t.twoSum(num, target);
		for(int i=0;i<indices.length;i++)
			System.out.print(indices[i]);
		
	}
}
