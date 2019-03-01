package assignment1q2;

public class SearchElement {
	boolean flag=false;

	public boolean Search(int[] arr,int ele)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				flag=true;
			}
		}
		return flag;
	}
	
	public static void main(String args[])
	{
		int[] arr= {23,3,15,67,89,45,62};
		int ele=55;
		SearchElement s=new SearchElement();
		boolean flag=s.Search(arr, ele);
		if(flag)
			System.out.println("The element is present");
		else
			System.out.println("The element is not present");
	}
}
