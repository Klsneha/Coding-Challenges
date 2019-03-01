package flippingAnImage;

public class FlippingAnImage {

	public int[][] flipAndInvertImage(int[][] A) {
		for(int i=0;i<A.length;i++)
		{
			//int strt=i;
			int end=A.length-1;
			int j=0;
			int temp=0;
			while(j<end)
			{
				temp=A[i][j];
				A[i][j]=A[i][end];
				A[i][end]=temp;
				
				
				j++;
				end--;
				
			}
		}
		
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[i].length;j++)
			{
				if(A[i][j]==0)
				{
					A[i][j]=1;
				}
				else
				{
					A[i][j]=0;
				}
			}
			
		}
		
		return A;
        
    }
	
	public static void main(String args[])
	{
		int m[][]= {
				{1,1,0},
				{1,0,1},
				{0,0,0}
		};
		FlippingAnImage f=new FlippingAnImage();
		int mat[][]=f.flipAndInvertImage(m);
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println("");
			
		}
		
	}
}
