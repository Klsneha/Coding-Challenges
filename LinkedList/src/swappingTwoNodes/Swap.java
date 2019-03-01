package swappingTwoNodes;


public class Swap {
	
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			this.data=d;
		}
	}
	
	public  void display()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	public void swapping(int x, int y)
	{
		Node n=head;
		Node temp=null;
		Node prev=null;
		
		while(n.next!=null)
		{
			if(n.next.data==x)
			{
				prev=n;
				temp=n.next;
				
			}
			if(n.next.data==y)
			{
				n.next=temp;
				prev.next=n.next;
			}
			n=n.next;
		}
	}
	
	public static void main(String args[])
	{
		Swap p=new Swap();
	p.head=new Node(10);
	Node two=new Node(15);
	Node three=new Node(12);
	Node four=new Node(13);
	Node five=new Node(20);
	
	p.head.next=two;
	two.next=three;
	three.next=four;
	four.next=five;
	p.display();
	System.out.println("*******");
	p.swapping(12,13);
	p.display();
	
	}

}
