package enumerationTest;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


public class EnumerationTest {
	
	public static void main(String args[])
	{
		Enumeration days;
		Vector dayNames=new Vector();
		
		dayNames.add("Mon");
		dayNames.add("Tue");
		dayNames.add("wed");
		
		days=dayNames.elements();
		while(days.hasMoreElements())
		{
			System.out.println(days.nextElement());
		}
		
		Iterator it=dayNames.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
