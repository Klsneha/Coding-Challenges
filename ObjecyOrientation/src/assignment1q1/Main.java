package assignment1q1;

public class Main {
	public static void doDisplay( Parent o ) 
    {
		o.display();   

    }

	public static void main(String[] args) 
    {
 
	 Parent x = new Parent();

	 Parent y = new Child();

     Child z = new Child();

     doDisplay(x);
   
     doDisplay(y);

     doDisplay(z);

    }



}
