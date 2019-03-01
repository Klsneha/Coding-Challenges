package ThreadsExamples;

public class ThreadDemo {

	public static void main(String args[])
	{
		Thread1 t1=new Thread1();
		
		t1.start();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getState());
		
		t1.run();
		Thread2 t2=new Thread2();
		t2.start();
		
		System.out.println(t2.getId());
		System.out.println(t2.getName());
		System.out.println(t2.getState());
	}
}
