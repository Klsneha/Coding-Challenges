package RecursionDemo;

public class PrintingExample {
	
	static int  printDemo(int num)
	{
		if(num<1)
		{
			return num; 
		}
		else
		{
		System.out.println("num is"+ num);
		int a=printDemo(num-1);
		System.out.println("num after recursion"+a);
		return num;
		}
	}
	
	public static void main(String args[])
	{
		int num=4;
		System.out.println("main"+printDemo(num));
		
	}

}
