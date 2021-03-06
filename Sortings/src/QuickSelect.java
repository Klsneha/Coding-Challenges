
public class QuickSelect {

	int partition(int arr[], int l, int r) 
	{ 
	    int x = arr[r], i = l; 
	    for (int j = l; j <= r - 1; j++) { 
	        if (arr[j] <= x) { 
	        	int temp=arr[i];
	        	arr[i]=arr[j];
	        	arr[j]=temp;
	            i++; 
	        } 
	    } 
	    int temp=arr[i];
    	arr[i]=arr[r];
    	arr[r]=temp;
	    return i; 
	} 
	
	int kthSmallest(int arr[], int l, int r, int k) 
	{ 
	    // If k is smaller than number of  
	    // elements in array 
	    if (k > 0 && k <= r - l + 1) { 
	  
	        // Partition the array around last  
	        // element and get position of pivot  
	        // element in sorted array 
	        int index = partition(arr, l, r); 
	  
	        // If position is same as k 
	        if (index - l == k - 1) 
	            return arr[index]; 
	  
	        // If position is more, recur  
	        // for left subarray 
	        if (index - l > k - 1)  
	            return kthSmallest(arr, l, index - 1, k); 
	  
	        // Else recur for right subarray 
	        return kthSmallest(arr, index + 1, r,  
	                            k - index + l - 1); 
	    } 
	  
	    // If k is more than number of  
	    // elements in array 
	    return Integer.MAX_VALUE; 
	} 
	
	public static void main(String args[])
	{
		QuickSelect q=new QuickSelect();
		int arr[] = { 10, 4, 5, 12, 6, 13, 26 }; 
		int n = arr.length;
		int k = 3;
		System.out.println("Kth smallest elemt is"+q.kthSmallest(arr, 0, n-1, k));
	}
	
	
}
