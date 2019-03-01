package OverloadingConcept;

public class Demo {

	public int example(int a,double b)
	{
		return 0;
	}
	
	public int example(double a,double b)
	{
		return 0;
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		
	}
}
