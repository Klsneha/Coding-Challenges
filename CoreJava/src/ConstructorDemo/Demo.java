package ConstructorDemo;

public class Demo {
	int b;
	Demo(int a)
	{
		System.out.println("parameterized");
	}
	
	public void display()
	{
		System.out.println(b);
	}

	public static void main(String[] args) {
		int a=10;
		Demo d=new Demo(a);
		d.display();
	}
}

