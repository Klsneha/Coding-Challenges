package reverseLinkedList;

public class Reverse {
	
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
	
	public void  reverse()
	{
		Node prev=null;
		Node current=head;
		Node next=null;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
		
	}
	public static void main(String args[])
	{
		Reverse p=new Reverse();
	p.head=new Node(1);
	Node two=new Node(2);
	Node three=new Node(3);
	Node four=new Node(4);
	Node five=new Node(5);
	
	p.head.next=two;
	two.next=three;
	three.next=four;
	four.next=five;
	p.display();
	System.out.println("*******");
	p.reverse();
	p.display();
	
	}

}
