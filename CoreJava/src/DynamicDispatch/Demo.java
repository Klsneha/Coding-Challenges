package DynamicDispatch;
public class Demo {

	public static void main(String[] args) {
		Animal a1=new Animal();
		Dog d1=new Dog();
		Animal ad=new Dog();
		a1.move();
		d1.move();
		ad.move();
		
	}
	
	
	
}

