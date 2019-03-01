package RecursionDemo;

public class sumOfNumbers {

	static int sum(int num)
	{
		if(num==1)
		{
			return 1;
		}
		else
		{
			return sum(num-1)+num;
		}
	}
	
	public static void main(String args[]) {
		System.out.println(sum(6));
	}
}
