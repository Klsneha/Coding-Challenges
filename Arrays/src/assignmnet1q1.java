/* Largest and smallest element in an array*/

public class assignmnet1q1 {

	int max=0;
	int min=0;
	
	
	public int smallest(int[] arr)
	{
		min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
		}
		return min;
	}

	public int largest(int[] arr) {
		// TODO Auto-generated method stub
		max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
}
