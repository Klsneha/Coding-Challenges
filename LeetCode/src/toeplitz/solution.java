package toeplitz;

//This is bruteforce method

public class solution {
	
 public boolean isToeplitzMatrix(int[][] matrix) {
	 
	 boolean flag=true;
	 for(int i=1;i<matrix.length;i++)
	 {
		 for(int j=1;j<matrix[i].length;j++)
		 {
			 if(matrix[i][j]!=matrix[i-1][j-1])
			 {
				 flag=false;
				 break;
			 }
		 }
		 System.out.println(" ");
	 }
	 return flag;
  }

public static void main(String args[])
	{
		int a[][]= {{1,2,3,4},
				{5,1,2,3},
				{9,6,1,2}
		};
		solution s=new solution();
		boolean flag=s.isToeplitzMatrix(a);
		System.out.println(flag);
		
	}

}
