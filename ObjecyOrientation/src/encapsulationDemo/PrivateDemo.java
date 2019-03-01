package encapsulationDemo;

public class PrivateDemo {

	private  static int a;
	public static void main(String[] args) {
		int b=1;
		// TODO Auto-generated method stub
		System.out.println("Hello Welcome Back");
		System.out.println(a);
		System.out.println(b);
	}

}
/* Key points
1) Static methos can only access static variables. Private variable has a scope within the same class
2) local variables of a method need to be initialized.
3) instance variables are default initialised to their default values. This is done by calling their default constructor.abstract*/