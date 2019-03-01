package reshapethematrix;
import java.util.*;
public class ReShapeTheMatrix {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int mat[][]=new int[r][c];
        Queue<Integer> q=new LinkedList<Integer>();
    	for(int i=0;i<nums.length;i++)
    	{
    		for(int j=0;j<nums[i].length;j++)
    		{
    			q.add(nums[i][j]);
    		}
    	}
    	
    	for(int m=0;m<r;m++)
    	{
    		for(int n=0;n<c;n++)
    		{
    			mat[m][n]=q.remove();
    		}
    	}
    	return mat;
    }
	public static void main(String args[])
	{
		int arr[][]= {{1,2},
				{3,4}};
		ReShapeTheMatrix r=new ReShapeTheMatrix();
		int mat[][]=r.matrixReshape(arr, 1, 4);
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