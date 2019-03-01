package encapsulationDemo;

public class ConstructorDemo {

	private int creditNumber;
	private int balance;
	private int age;
	public ConstructorDemo(int Number)
	{
		creditNumber=Number;
		
	}
	public void display()
	{
		System.out.println("creditNumber"+creditNumber);
		System.out.println("balance"+balance);
		System.out.println("age"+age);
	}
	public static void main(String args[])
	{
		ConstructorDemo c=new ConstructorDemo(23);
		c.display();
	}
	
}

/*Here if I create a constructor then default constructor is not called to intialize instance variables
I expected.. there will be an error for balance and age as they are not initialised either in teh user 
defined constructor or at the top. but still I got the default values as the ans
*/
