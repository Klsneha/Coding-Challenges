package encapsulationDemo;

public class Car extends Vehicle {

	private int Number;
	Car(String brand)
	{
		super(123);
		System.out.println(brand);
	}
	public void display()
	{
		setNumber(23);
		Number=getNumber();
		System.out.println("The Number is"+Number);
	}
	
	public static void main(String args[])
	{
		Car c=new Car("Maruthi");
		c.display();
		if (c instanceof Vehicle) {
			System.out.println("true");
			
		}
				
	}
	
}

/*Basic implementation of encapulation
1) Car and Vehicle classes
*/
