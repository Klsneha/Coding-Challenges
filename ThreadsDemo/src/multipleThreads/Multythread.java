package multipleThreads;

public class Multythread implements Runnable {

	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("Run by "+Thread.currentThread().getName()+" i is"+i);
			System.out.println("ID is"+Thread.currentThread().getId());
		}
	}
	
	public static void main(String args[]) throws InterruptedException
	{
		Multythread mul=new Multythread();
		Thread one=new Thread(mul);
		Thread two=new Thread(mul);
		Thread three=new Thread(mul);
		one.setName("First");
		two.setName("Second");
		three.setName("Third");
		//one.setPriority(1);
		//two.setPriority(5);
		//three.setPriority(10);
		three.sleep(1*60);
		one.start();
		two.start();
		three.start();
		
	}
}
