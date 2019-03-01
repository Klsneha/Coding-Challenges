package RecursionDemo;

public class FibonacciRecusion {
	static int lookup[]=new int[5];
	public static int Fib(int num) {
		
		
		
		if(lookup[num]==0)
		{
			if(num<=1)
			{
				lookup[num]= 1;
			}
			else
			{
				
				lookup[num]= Fib(num-1)+Fib(num-2);
				
			}
			
		}
		
		System.out.println("******");
		for(int i=0;i<lookup.length;i++)
		{
			System.out.println(lookup[i]);
		}
		return lookup[num];
		
			
	}
	
	public static void main(String args[])
	{
		System.out.println(Fib(4));
	}
}
