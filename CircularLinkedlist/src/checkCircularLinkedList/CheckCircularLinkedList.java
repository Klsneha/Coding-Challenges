package checkCircularLinkedList;

public class CheckCircularLinkedList {
	
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
	
	/*public  void display(Node one)
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
			
	}*/
	
	public void checkLinked(Node one)
	{
	
		Node n=one;
		boolean flag=false;
		while(n.next!=null) {
			if(n.next==one)
			{
				flag=true;
				break;
			}
			n=n.next;
		}
		
		if(flag)
		{
			System.out.println("circular Linked List");
		}
		else
		{
			System.out.println("Not a circular linked list");
		}
	}
	
	public static void main(String args[])
	{
	
	CheckCircularLinkedList p=new CheckCircularLinkedList();
	Node one=new Node(1);
	Node two=new Node(2);
	Node three=new Node(3);
	Node four=new Node(4);
	Node five=new Node(5);
	
	one.next=two;
	two.next=three;
	three.next=four;
	four.next=five;
	//five.next=one;
	//p.display(one);
	p.checkLinked(one);
	
	
		
	}


}
