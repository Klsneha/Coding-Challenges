package sortingCollections;

public class Student implements Comparable<Student> {
	
	 int id;
	 String Name;
	 
	Student(int id, String Name)
	{
		this.id=id;
		this.Name=Name;
		
	}

	@Override
	public int compareTo(Student s1) {
		// TODO Auto-generated method stub
		return Name.compareTo(s1.getName());
	}
	
	public String toString() {
		return Name+" "+id;
	}
	
	public String getName()
	{
		return Name;
	}

}
