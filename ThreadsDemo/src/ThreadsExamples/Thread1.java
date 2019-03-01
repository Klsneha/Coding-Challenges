package ThreadsExamples;

public class Thread1 extends Thread {

	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("Sample Thread example"+i);
		}
	}
}
