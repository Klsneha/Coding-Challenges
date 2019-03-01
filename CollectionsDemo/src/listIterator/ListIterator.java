package listIterator;
import java.util.*;

public class ListIterator {

	public static void main(String args[])
	{
		List<String> names=new ArrayList<String>();
		names.add("Sneha");
		names.add("banda buchki");
		names.add("kuchipoo");
		names.add("Akhil");
		names.add("Marri");
		java.util.ListIterator<String> lit=names.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		System.out.println("*******");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
		
		
	}
}
