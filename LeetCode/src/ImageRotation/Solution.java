package ImageRotation;

public class Solution {
	 public int[][] rotate(int[][] matrix) {
	        
		 for(int i=0;i<matrix.length;i++)
		 {
			 for(int j=i;j<matrix[i].length;j++)
			 {
				 int temp=matrix[i][j];
				 matrix[i][j]=matrix[j][i];
				 matrix[j][i]=temp;
			 }
		 }
		 
		 for(int k=0;k<matrix.length;k++)
		 {
			 int st=0;
			 int end=matrix[k].length-1;
			 while(st<end)
			 {
				 int temp=matrix[k][st];
				 matrix[k][st]=matrix[k][end];
				 matrix[k][end]=temp;
				 st++;
				 end--;
			 }
		 }
		 return matrix;
		 
	    }
	public static void main(String[] args) {
		
		/*int mat[][]= {{1,2,3},
					{4,5,6},
					{7,8,9}};
		*/
		
		int mat[][]= {
					{ 5, 1, 9,11},
		             {2, 4, 8,10},
		             {13, 3, 6, 7},
		             {15,14,12,16}
		};
		Solution s=new Solution();
		int sol[][]=s.rotate(mat);
		
		for(int i=0;i<sol.length;i++)
		 {
			 for(int j=0;j<sol[i].length;j++)
			 {
				 System.out.print(sol[i][j]);
			 }
			 System.out.println();
		 }
	}
}