package setMatrixZero;
import java.awt.Point;
import java.util.*;
public class Solutions {

	 public void setZeroes(int[][] matrix) {
	        
		 List<Point> li=new ArrayList();
	        for(int i=0;i<matrix.length;i++)
	        {
	            for(int j=0;j<matrix[i].length;j++)
	            {
	                if(matrix[i][j]==0)
	                {
	                   li.add(new Point(i,j));
	                }
	            }
	        }
	        
	        for(int k=0;k<li.size();k++)
	        {
	            int x=li.get(k).x;
	            int y=li.get(k).y;
	            
	            for(int m=0;m<matrix.length;m++)
	            {
	            	matrix[m][y]=0;
	            }
	            for(int n=0;n<matrix[x].length;n++)
	            {
	            	matrix[x][n]=0;
	            }
	        }
	        
	        for(int i=0;i<matrix.length;i++)
	        {
	        	for(int j=0;j<matrix[i].length;j++)
	        	{
	        		System.out.print(matrix[i][j]);
	        	}
	        	System.out.println();
	        }

	    }
	 
	 	public static void main(String args[])
	 	{
	 		Solutions s=new Solutions();
	 		int[][] matrix= {{1,1,1},
	 				{1,0,1},
	 				{1,1,1}};
	 		/*int[][]matrix= {
	 		              {0,1,2,0},
	 		             {3,4,5,2},
	 		             {1,3,1,5}
	 		};
	 		*/
	 		s.setZeroes(matrix);
	 	}
}
