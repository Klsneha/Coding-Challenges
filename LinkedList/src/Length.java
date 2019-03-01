

public class Length {

	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			this.data=d;
		}
	}
	
	public  void display()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	public int lengthList()
	{
		int count=0;
		Node n=head;
		while(n!=null)
		{
			count=count+1;
			n=n.next;
			
		}
		return count;
	}
	
	public static void main(String args[])
	{
		Length list=new Length();
		list.head=new Node(1);
		Node second=new Node(2);
		Node three=new Node(3);
		Node four=new Node(4);
		list.head.next=second;
		second.next=three;
		three.next=four;
		list.display();
		System.out.println("Length is"+list.lengthList());
		
	}
}
