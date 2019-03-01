package SingleLinkedList;

import SingleLinkedList.DeletionNode.Node;

public class DeletingAtPosition {
	
	Node head;
	Node tail;
	class Node{
		int data;
		Node next;
		Node(int d)
		{
			this.data=d;
			next=null;
		}
	}
	
	public void deleteNode(int pos)
	{
		Node n=head;
		if(pos==0)
		{
			head=n.next;
		}
		
		Node temp=head;
		for(int i=1;i<pos;i++)
		{
			temp=temp.next;
		}
		
		if(temp==null)
			return;
		temp.next=temp.next.next;
	}
	
	public void append(int d)
	{
		Node new_node=new Node(d);
		if(head==null)
		{
			head=new_node;
			tail=new_node;
		}
		else if(tail!=null)
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
	public static void main(String args[])
	{
		DeletingAtPosition d=new DeletingAtPosition();
		d.append(0);
		d.append(1);
		d.append(2);
		d.append(3);
		d.append(4);
		d.append(5);
		d.traversal();
		d.deleteNode(7);
		d.traversal();
		System.out.println("sneha");
		
		
	}

}
