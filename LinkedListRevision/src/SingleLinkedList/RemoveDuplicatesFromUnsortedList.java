package SingleLinkedList;

import java.util.HashSet;

import SingleLinkedList.RepeatingNodes.Node;

public class RemoveDuplicatesFromUnsortedList {

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
	
	public void remove(Node n)
	{
		HashSet<Integer> h=new HashSet<>();
		Node prev=null;
		while(n!=null)
		{
			int d=n.data;
			if(h.contains(d))
			{
				prev.next=n.next;
			}
			else
			{
				h.add(d);
				prev=n;
				
			}
			n=n.next;
		}
		
	}
	
	
	public static void main(String args[])
	{
		RemoveDuplicatesFromUnsortedList d=new RemoveDuplicatesFromUnsortedList();
		d.append(1);
		d.append(2);
		d.append(1);
		d.append(1);
		d.append(2);
		d.append(1);
		d.append(3);
		d.traversal();
		d.remove(d.head);
		System.out.println("**");
		d.traversal();
	
		
	}
}
