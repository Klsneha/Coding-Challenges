package deletion;

public class Deletion {
	
	Node head;
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			this.data=d;
			this.next=null;
		}
	}
	
	public void display()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	public void delNode(Node delNode)
	{
		Node n=head;
		Node prev=null;
		while(n.next!=null)
		{
			if(n.equals(delNode))
			{
				head=n.next;
			}
			else
			{
				prev=n;
				n=n.next;
				if(n.equals(delNode))
				{
					prev.next=n.next;
					break;
					
				}
			}
		}
		
	}
	
	public static void main(String args[])
	{
		Deletion list=new Deletion();
		list.head=new Node(1);
		Node second=new Node(2);
		Node three=new Node(3);
		Node four=new Node(4);
		list.head.next=second;
		second.next=three;
		three.next=four;
		list.display();
		//System.out.println("Deleting Head node");
		//list.delNode(list.head);
		//list.display();
		System.out.println("Deleting inbetween node");
		list.delNode(second);
		list.display();
	}

}
