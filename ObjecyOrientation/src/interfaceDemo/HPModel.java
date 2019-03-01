package interfaceDemo;

public class HPModel extends HP {

	public void pdf()
	{
		System.out.println("creation of PDF");
	}
	public static void main(String args[])
	{
		HPModel h=new HPModel();
		h.pdf();
		h.Print();
		h.Scan();
	}
}
