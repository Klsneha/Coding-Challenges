package Traversal;


public class TraversalDemo {

	
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			this.data=d;
		}
	}
	
	public  void display(Node one)
	{
		Node n=one;
		if(n!=null)
		{
			do
			{
				System.out.println(n.data);
				n=n.next;
			}while(n!=one);
		}
			
	}
	
	public static void main(String args[])
	{
		TraversalDemo p=new TraversalDemo();
	Node one=new Node(1);
	Node two=new Node(2);
	Node three=new Node(3);
	Node four=new Node(4);
	Node five=new Node(1);
	
	one.next=two;
	two.next=three;
	three.next=four;
	four.next=five;
	five.next=one;
	p.display(one);
		
	}

}
