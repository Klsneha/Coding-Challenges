package SingleLinkedList;

import SingleLinkedList.LengthRecursive.Node;

public class LastEleFront {

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
	
	public void lastinFirst(Node n)
	{
		Node prev=null;
		head=n;
		while(n.next!=null)
		{
			prev=n;
			n=n.next;
		
		}
		prev.next=null;
		n.next=head;
		head=n;
		
		
		
	
		
		
	}
	public static void main(String args[])
	{
		LastEleFront d=new LastEleFront();
		d.append(0);
		d.append(1);
		d.append(2);
		d.append(3);
		d.append(4);
		d.append(5);
		d.traversal();
		d.lastinFirst(d.head);
		System.out.println("**");
		d.traversal();
		
	}

}
