package bubbleSort;

public class BubbleSort {
	 public static  int[] sort(int[] a)
	 {
		 int n=a.length;
		 int temp;
		 boolean swapped=false;// this is included for Adaptive sorting concept to be include. 
		 for(int i=0;i<n-1;i++)//In Every Pass highest number will be sorted and placed at the end
		 {
			 System.out.println(i);
			 for(int j=0;j<n-i-1;j++)//hence the number which got sorted is not used in further comparisons. 
			 {
				 swapped=false;
				 if(a[j]>a[j+1])
				 {
					 temp=a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
					 swapped=true;
				 }
			 }
			 if(swapped==false)
				 break;
		 }
		 return a;
	 }
	
	public static void main(String args[])
	{
		int[] a= {10,2,8,4,3,9};
		a=sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		
	}

}
