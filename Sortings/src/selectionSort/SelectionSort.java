package selectionSort;

public class SelectionSort {
	
	public static void sort(int arr[])
	{
		int min=0;
		int n=arr.length;
		int index=0;
		int temp=0;
		//System.out.println(n);
		for(int i=0;i<=n-1;i++)
		{
			//min=arr[i];
			index=i;
		
			for(int j=i+1; j<=n-1;j++)
			{
				if(arr[j]<arr[index])
				{
					//min=arr[j];
					index=j;
				}
			}
			
			temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
		
		for(int l=0;l<=n-1;l++)
		{
			System.out.print(arr[l]+" ");
		}
	}
	
	
	public static void main(String args[])
	{
		int[] a= {14,3,2,10,12,5,6};
		sort(a);
	}

}
