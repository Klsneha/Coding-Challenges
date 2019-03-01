package mergeSortGeeksForGeeks;

public class MergeSort {

	void merge(int arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
        
        
        for(int i=0;i<n1;i++)
		{
			L[i]=arr[i];
		}
		L[L.length-1]=Integer.MAX_VALUE;
		
		for(int j=0;j<n2;j++)
		{
			R[j]=arr[m+1];
			m++;
		}
		R[R.length-1]=Integer.MAX_VALUE;
  
		int i=0;
		int j=0;
		for(int k=0;k<arr.length;k++)
		{
			
			if(L[i]<=R[j])
			{
				arr[k]=L[i];
				i=i+1;
				
			}
			else if(L[i]>=R[j])
			{
				arr[k]=R[j];
				j=j+1;
			}
		
		
		}
  
        
  
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    void sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int arr[] = {12, 11, 13, 5, 6, 7}; 
  
        System.out.println("Given Array"); 
        printArray(arr); 
  
        MergeSort ob = new MergeSort(); 
        ob.sort(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        printArray(arr); 
    } 
}
