
public class ConstructorDemo {

	int a;
	int b;
	ConstructorDemo(int x)
	{
		System.out.println("Parameterized constructor");
		System.out.println(a);
		System.out.println(b);
	}
	{
		System.out.println("block");
	}
}
