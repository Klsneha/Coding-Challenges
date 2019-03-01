package lastEleFirst;

public class LastElementFirst {


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
	
	public void lastEleFirst()
	{
		Node n=head;
		Node temp=null;
		
		while(n!=null && n.next!=null)
		{
			if(n.next.next==null)
			{
				temp=n.next;
				//System.out.println("Temp"+ temp.data);
				n.next=null;
			//	System.out.println("n.next"+n.data+" "+n.next);
				temp.next=head;
				head=temp;
			}
			n=n.next;
			//System.out.println(n.data);
		}
				
	}
	
	public static void main(String args[])
	{
		LastElementFirst p=new LastElementFirst();
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
	p.lastEleFirst();
	p.display();
	
	}

}
