package quicksort;

public class QuickSort {
	
	public static int Partition(int arr[],int p,int r)
	{
		int i=p-1;
		
		int x=arr[r];
		for(int j=p;j<=r-1;j++)
		{
			
			if(arr[j]<x)
			{
				i=i+1;
				Swapping(arr, i,j);
				
			}
		}
		
		Swapping(arr,i+1,r);
		
		
		return i+1;
		
	}
	public static void Swapping(int arr[], int x, int y)
	{
		int temp=0;
		temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}

	public void sortingElements(int arr[], int p, int r)
	{
		if(p<r)
		{
			int q=Partition(arr, p, r);
			sortingElements(arr, p, q-1);
			sortingElements(arr, q+1, r);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,6,5,0,8,2,4,7};
		/*int q=Partition(arr,0,arr.length-1);
		System.out.println("Pivt is at"+q);*/
		
		QuickSort qs=new QuickSort();
		qs.sortingElements(arr, 0, arr.length-1);
		System.out.println("elements are ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		

	}

}
