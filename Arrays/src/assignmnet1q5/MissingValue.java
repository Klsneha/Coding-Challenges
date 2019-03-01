package assignmnet1q5;

public class MissingValue {
	
	public static void main(String args[])
	{
		int[] arr=new int[100];
		MissingValue v=new MissingValue();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i;
		}
		int missingValue=v.deletion(arr, 55);
		System.out.println("Missing Value is"+missingValue);
		
	}
	public int deletion(int arr[],int num)
	{
		int value=0;
		int[] temp=new int[arr.length-1];
		System.arraycopy(arr,0,temp,0,num);
		System.arraycopy(arr, num+1, temp, num, arr.length-num-1);
		
		for(int k=0;k<temp.length;k++)
		{
			System.out.println(temp[k]);
		}
		
		for(int i=0;i<temp.length;i++)
		{
			//System.out.println("Missing computation"+temp[i]);
			//System.out.println("Comparing value"+i);
				if(temp[i]!=i)
				{
				value=i;
				break;
				}
		
		}
		return value;
	}

	
}
