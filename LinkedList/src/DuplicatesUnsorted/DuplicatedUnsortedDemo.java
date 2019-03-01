package DuplicatesUnsorted;



public class DuplicatedUnsortedDemo {
	
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
	
	public void duplicate()
	{
		Node n=null;
		n=head;
		Node n1=null;
		//Node n1=n;
		while(n!=null && n.next!=null )
		{
			n1=n;
			while(n1.next!=null)
			{
				
					if(n.data==n1.next.data)
					{
						n1.next=n1.next.next;
						System.gc();
					}
					else {
						n1=n1.next;
					}
					

			}
			n=n.next;
		}
		
		
	}
	
	public static void main(String args[])
	{
		DuplicatedUnsortedDemo p=new DuplicatedUnsortedDemo();
	p.head=new Node(1);
	Node two=new Node(2);
	Node three=new Node(3);
	Node four=new Node(2);
	Node five=new Node(3);
	
	p.head.next=two;
	two.next=three;
	three.next=four;
	four.next=five;
	p.display();
	System.out.println("*******");
	p.duplicate();
	p.display();
	}

}
