package assignmnet1q3;

public class Sorting {
	
	public int[] sort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		return arr;
	}
	
	public static void main(String args[])
	{
		Sorting s=new Sorting();
		int[] arr= {64, 34, 25, 12, 22, 11, 90};
		int[] sortArray=s.sort(arr);
		for(int i=0;i<sortArray.length;i++)
		{
			System.out.println(sortArray[i]);
		}
	}

}
