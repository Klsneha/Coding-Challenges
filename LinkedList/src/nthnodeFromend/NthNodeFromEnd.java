package nthnodeFromend;

public class NthNodeFromEnd {

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
	
	public Node nthElementFromBack(int length, int pos)
	{
		int loc=length-pos+1;
		Node n=head;
		int count=1;
		while(n.next!=null && count!=loc)
		{
			n=n.next;
			count=count+1;
		}
		
		return n;
		
	}
	
	public static void main(String args[])
	{
		NthNodeFromEnd list=new NthNodeFromEnd();
		list.head=new Node(1);
		Node second=new Node(2);
		Node three=new Node(3);
		Node four=new Node(4);
		list.head.next=second;
		second.next=three;
		three.next=four;
		list.display();
		int count=list.lengthList();
		Node n=list.nthElementFromBack(count,2);
		System.out.println("value from last");
		System.out.println(n.data);
		
	}
}
