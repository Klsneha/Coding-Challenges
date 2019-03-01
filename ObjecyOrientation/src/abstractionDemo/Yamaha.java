package abstractionDemo;

public class Yamaha extends Bike {

	public void Model()
	{
		System.out.println("The Model is Yamaha");
	}
	public void year()
	{
		System.out.println("2003 model");
	}
	public void gearChange(int a)
	{
		System.out.println("gear is still chankging");
	}
	public void gearChange()
	{
		System.out.println("same type gear change");
	}
	public static void main(String args[])
	{
		Bike b=new Yamaha();
		b.Model();
		//b.gearChange(2);/* here as bike doesnt have parameterized gearchange method an error is popping
		//b.year();/* since year is not present in bike and error
		System.out.println("yamaha*********");
		Yamaha y=new Yamaha();
		y.Model();
		y.gearChange();//over riding concept taken from sub  class
		//y.gearChange(23);
		//y.year();
		
	}
}
