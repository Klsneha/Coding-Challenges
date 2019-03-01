package SingleLinkedList;

import SingleLinkedList.RepeatingNodes.Node;

public class RemoveDuplicatesFromSortedList {
	
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
	
	public void removeDuplicates(Node n)
	{
		while(n.next!=null)
		{
			if(n.data==n.next.data)
			{
				n.next=n.next.next;
				continue;
			}
			else
			{
				n=n.next;
			}
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
	
	
	public static void main(String args[])
	{
		RemoveDuplicatesFromSortedList d=new RemoveDuplicatesFromSortedList();
		d.append(1);
		d.append(1);
		d.append(1);
		d.append(2);
		d.append(2);
		d.append(3);
		d.append(4);
		d.append(4);
		d.append(5);
		d.append(5);
		d.traversal();
		d.removeDuplicates(d.head);
		System.out.println("********");
		d.traversal();
	
		
	}

}
