package abstractionDemo;

public abstract class Bike {

	Bike()
	{
		System.out.println("This is a Bike");
	}
	public abstract void Model();
	public void gearChange()
	{
		System.out.println("The gear is Changed");
	}
}
