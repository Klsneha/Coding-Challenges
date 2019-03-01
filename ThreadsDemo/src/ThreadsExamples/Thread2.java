package ThreadsExamples;

public class Thread2 extends Thread {

	public void run()
	{
		for(int j=0;j<3;j++)
		System.out.println("Sample thread class2"+j);
	}
}
