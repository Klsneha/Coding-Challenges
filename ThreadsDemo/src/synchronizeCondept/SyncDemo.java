package synchronizeCondept;

public class SyncDemo extends Thread {

	static int count=1;
	public synchronized  void run()
	{
		count++;
		System.out.println("count is"+count);
	}
	
	public static void main(String args[])
	{
		for(int i=0;i<40;i++)
		{
			SyncDemo s=new SyncDemo();
			s.start();
		}
	}
}
