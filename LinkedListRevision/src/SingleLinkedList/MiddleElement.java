package SingleLinkedList;

import SingleLinkedList.NthNodeFromEnd.Node;

public class MiddleElement {
	
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
	
	public void middleElement()
	{
		Node p1=head;
		Node p2=head;
		
		while(p2!=null && p2.next!=null)
		{
				p1=p1.next;
				p2=p2.next.next;
			
		}
		
		System.out.println(p1.data);
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
	
	
	public static void main(String args[])
	{
		MiddleElement d=new MiddleElement();
		//d.append(0);
		d.append(1);
		d.append(2);
		d.append(3);
		d.append(4);
		d.append(5);
		d.append(6);
		d.traversal();
		d.middleElement();
		
	}

}
