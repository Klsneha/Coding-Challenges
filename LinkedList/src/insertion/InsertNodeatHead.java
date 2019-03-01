package insertion;



public class InsertNodeatHead {

    Node head;
	
	static class Node
	{
		int data;
		Node next;
		
		 Node(int d)
		{
			this.data=d;
			next=null;
		}
	
	}
	public void printList()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data+" ");
			//System.out.println(n.next+"    ");
			n=n.next;
		}
	}
	
	public void headInsert(Node n)
	{
		n.next=head;
		head=n;
	}
	
	public void pushInbetween(Node newNode, Node prevNode)
	{
		newNode.next=prevNode.next;
		prevNode.next=newNode;
		
	}
	
	public void pushEnd(Node newNode)
	{	if(head.next==null)
	{
		head=newNode;
	}
	else
	{
		Node n=head;
				while(n.next!=null)
				{
					n=n.next;
				}
				n.next=newNode;
	}
	}
	
	public static void main(String args[])
	{
		InsertNodeatHead list=new InsertNodeatHead();
		list.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		list.head.next=second;
		second.next=third;
		list.printList();
		Node headNew=new Node(0);
		list.headInsert(headNew);
		System.out.println("After Head Insert");
		list.printList();
		System.out.println("Inbetween Insert");
		Node newNode=new Node(4);
		list.pushInbetween(newNode, second);
		list.printList();
		System.out.println("Adding at end");
		Node endNode=new Node(5);
		list.pushEnd(endNode);
		list.printList();
	}
	
}
