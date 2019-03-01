package DisjointIntervals;

public class Solutions {

	public int partitionDisjoint(int[] A) {
        int left=0;
        for(int i=0;i<A.length;i++)
        {
        	System.out.println("i is"+A[i]);
            for(int j=0;j<i;j++ )
            {
            	System.out.println("j is"+A[j]);
                if(A[i]<=A[j])
                {
                    left=A[i];
                    break;
                }
            }
        }
        return left;
        
    }
	public static void main(String args[])
	{
		Solutions s=new Solutions();
		int A[]= {5,0,3,8,6};
		int res=s.partitionDisjoint(A);
		System.out.println(res);
		
	}
}
