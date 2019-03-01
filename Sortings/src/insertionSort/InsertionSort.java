package insertionSort;

public class InsertionSort {

	public static void sort(int[] a)
	{
		int n=a.length;
		int temp;
		for(int j=1;j<n-1;j++)//inserting one element into sorted array 
		{
			for(int i=0;i<j;i++)//assuming sorted array
			{
				if(a[j]<a[i])  //In the better version comparision and swapping were done using sing loop while
				{
					temp=a[j];
					for(int k=j;k>i;k--)//the pace where it needs to be inserted. 
					{
						a[k]=a[k-1];
					}
					a[i]=temp;
				}
			}
		}
		
		for(int l=0;l<n;l++)
		{
			System.out.print(a[l]);
		}
	}
	public static void main(String args[])
	{
		int[] a= {14,3,2,10,12,5,6};
		sort(a);
	}
}
