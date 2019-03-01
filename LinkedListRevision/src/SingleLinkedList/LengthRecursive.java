package SingleLinkedList;

public class LengthRecursive {
	Node head=null;
	Node tail=null;
	class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data=d;
			this.next=null;
		}
	}
	
	public void append(int d)
	{
		Node new_node=new Node(d);
		if(head==null)
		{
			head=new_node;
			tail=head;
		}
		else
		{
			tail.next=new_node;
			tail=new_node;
		}
		
	}
	
	public void traversal()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	public int lengthLinkedList(Node n)
	{
		if(n==null)
		{
			return 0;
		}
		else
		{
			return 1+lengthLinkedList(n.next);
		}
		
		
	}
	public static void main(String args[])
	{
		LengthRecursive d=new LengthRecursive();
		d.append(0);
		d.append(1);
		d.append(2);
		d.append(3);
		d.append(4);
		d.append(5);
		d.traversal();
		int count=d.lengthLinkedList(d.head);
		System.out.println("count"+count);
	}

}