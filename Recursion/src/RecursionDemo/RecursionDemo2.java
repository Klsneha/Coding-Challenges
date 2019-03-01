package RecursionDemo;

public class RecursionDemo2 {

	public static void main(String ars[])
	{
		fun(4);
				
	}
	static void fun(int x)
	{
		if(x>0) {
			fun(--x);
			System.out.println(x);
			fun(--x);
		}
	}
}
