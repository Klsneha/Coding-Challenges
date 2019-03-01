package twoDArray;

public class TwoDArrayDemo {
	public static void main(String args[])
	{
	int[][] a=new int[3][];
	a[0]=new int[3];
	a[1]=new int[3];
	a[2]=new int[]{2,3,4};
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(a[i][j]);
		}
	System.out.println(" ");
	}
	
	}
}
