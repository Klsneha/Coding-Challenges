package transposeOfMatrix;

public class TransposeOfMatrix {
	
	 public int[][] transpose(int[][] A) {
		 if(A.length!= A[0].length)
		 {
			 int mat[][]=new int[A[0].length][A.length];
			 
			 for(int i=0;i<A.length;i++)
			 {
				 for(int j=0;j<A[0].length;j++)
				 {
					 mat[j][i]=A[i][j];
				 }
			 }
			 return mat;
			 
		 }
		 else
		 {
		 for(int i=0;i<A.length;i++)
		 {
			 for(int j=0;j<i;j++)
			 {
				 if(i!=j)
				 {
					 int temp=A[i][j];
					 A[i][j]=A[j][i];
					 A[j][i]=temp;
				 }
			 }
		 }
		 return A;
		 }
	        
	    }
	 	public static void main(String args[])
	 	{
	 		int a[][]= {{1,2},
	 		{4,5},
	 		{7,8}};
	 		
	 		TransposeOfMatrix t=new TransposeOfMatrix();
	 		int mat[][]=t.transpose(a);
	 		for(int i=0;i<mat.length;i++)
	 		{
	 			for(int j=0;j<mat[i].length;j++)
	 			{
	 				System.out.print(mat[i][j]);
	 			}
	 			System.out.println(" ");
	 		}
	 		 
	 		
	 	}

}
