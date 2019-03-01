package sortingCollections;
import java.util.*;


public class SortingDemo {
	
	public static void main(String args[])
	{
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student(200,"Sneha"));
		list.add(new Student(300,"Akhil"));
		list.add(new Student(400,"Marri"));
		
		Collections.sort(list);
		System.out.println(list);
		
	}

}
