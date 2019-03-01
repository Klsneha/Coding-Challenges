package removeDuplicated;

public class RemoveDuplicates {

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
	
	public void duplicateCheck()
	{
		Node n=head;
		Node n1=null;
		
		while(n.next!=null)
		{
			if(n.data==n.next.data)
			{
				n.next=n.next.next;
				
			}
			else
			{
				n=n.next;
			}
		}
	}
	public static void main(String args[])
	{
		RemoveDuplicates p=new RemoveDuplicates();
	p.head=new Node(1);
	Node two=new Node(2);
	Node three=new Node(2);
	Node four=new Node(2);
	Node five=new Node(1);
	
	p.head.next=two;
	two.next=three;
	three.next=four;
	four.next=five;
	
	p.display();
	p.duplicateCheck();
	System.out.println("After removing duplicates");
	p.display();
	
	}

}
