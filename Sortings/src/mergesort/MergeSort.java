package mergesort;

public class MergeSort {

	int l=0;
	int r=0;
	public void Sort(int a[], int left,int right)
	{
		
		if(left<right)
		{
		
		int mid=(left+right)/2;
		Sort(a,left,mid);
		Sort(a,mid+1,right);
		merge(a,left,mid,right);	
		}
		
	}
	
	public void merge(int a[],int p,int q, int r)
	{
		int length=a.length;
		int n1=q-p+1;
		int n2= r-q;
		int left[]=new int[n1+1];
		int right[]=new int[n2+1];
	//	int array[]=new int[length];
		
		for(int i=0;i<n1;i++)
		{
			left[i]=a[i];
		}
		left[left.length-1]=Integer.MAX_VALUE;
		
		for(int j=0;j<n2;j++)
		{
			right[j]=a[q+1];
			q++;
		}
		right[right.length-1]=Integer.MAX_VALUE;
		
		int i=0;
		int j=0;
		for(int k=0;k<a.length;k++)
		{
			
			if(left[i]<=right[j])
			{
				a[k]=left[i];
				i=i+1;
				
			}
			else if(left[i]>=right[j])
			{
				a[k]=right[j];
				j=j+1;
			}
		
		
		}
	   } 
		
	
	public static void main(String args[])
	{
		//int arr[]= {5,6,8,4,7,9};
		int arr[]= {9,6,5,0,8,2};
		//System.out.println(arr.length);
		MergeSort m=new MergeSort();
		m.Sort(arr, 0, arr.length-1);
	//	m.merge(arr, 0, 2, arr.length-1);
		for(int b=0;b<arr.length;b++)
		{
			System.out.print(arr[b]);
		}
		
		
	}
}
