package SingleLinkedList;

import SingleLinkedList.LengthRecursive.Node;

public class SearchAnElementRecursive {
	
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
	
	public boolean findele(Node n,int d)
	{
		if(n==null)
			return false;
			
		if(n.data==d)
			return true;
		
		return findele(n.next,d);
	}
	public static void main(String args[])
	{
		SearchAnElementRecursive d=new SearchAnElementRecursive();
		d.append(0);
		d.append(1);
		d.append(2);
		d.append(3);
		d.append(4);
		d.append(5);
		d.traversal();
		boolean flag=false;
		flag=d.findele(d.head,0);
		System.out.println("count"+flag);
	}

}