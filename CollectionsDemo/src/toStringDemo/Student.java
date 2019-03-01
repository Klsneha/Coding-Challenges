package toStringDemo;

public class Student {

	public String name;
	public String id;
	
	public  Student(String name,String id)
	{
		this.name=name;
		this.id=id;
	}
	public String toString()
	{
		return "Name is"+name+"Id is"+id;
	}
}
