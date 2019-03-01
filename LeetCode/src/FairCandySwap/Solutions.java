package FairCandySwap;

public class Solutions {
	
	public int[] fairCandySwap(int[] A, int[] B) {
        int i=0;
        int sum1=0;
		while(i<A.length)
		{
			sum1=sum1+A[i];
		}
		int j=0;
		int sum2=0;
		while(j<B.length)
		{
			sum2=sum2+B[j];
		}
		
		int result[]=new int[2];
		for(int k=0;k<A.length;k++)
        {
        	for(int l=0;l<B.length;l++)
        	{
        		sum1=sum1-A[k]+B[l];
        		sum2=sum2-B[l]+A[k];
        		if(sum1==sum2)
        		{
        			result[0]=A[k];
        			result[1]=B[l];
        		}
        	}
        }
		return result;
    }
	public static void main(String args[])
	{
		Solutions s=new Solutions();
		int A[]= {1,2,5};
		int B[]= {2,4};
		int result[]=s.fairCandySwap(A, B);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}

}
