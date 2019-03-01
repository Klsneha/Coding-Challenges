package RecursionDemo;

public class RecursionDemo {

	static void fun1(int n)
	{
		int i = 0;   
		   if (n > 1) 
		     fun1(n-1); 
		   System.out.println("n is"+n);
		   for (i = 0; i < n; i++) 
		   System.out.println(" * "); 
	}
	
	public static void main(String args[])
	{
		fun1(3);
	}
}

