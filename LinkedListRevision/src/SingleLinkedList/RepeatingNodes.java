package SingleLinkedList;

import SingleLinkedList.NthNodeFromEnd.Node;

public class RepeatingNodes {
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
	
	public int count(Node n,int num) {
		
		if(n.next==null)
		{
			if(n.data==num)
				return 1;
			else
				return 0;
		}
			
		else if(n.data==num)
			return 1+count(n.next,num);
		else if(n.data!=num)
			return 0+count(n.next,num);
		
		return 0;
		
		
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
		RepeatingNodes d=new RepeatingNodes();
		d.append(1);
		d.append(2);
		d.append(1);
		d.append(1);
		d.append(2);
		d.append(1);
		d.append(2);
		d.traversal();
		System.out.println(d.count(d.head,1));
	
		
	}

}
