package insertIntoSortedList;


public class InsertIntoSortedList {
	
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
	
	public void insert(Node new_node, Node one)
	{
		
		Node last=null;
		Node n=one;
		if(one!=null)
		{   do
			{
				last=n;
				n=n.next;
			}while(n!=one);
		}
		if(new_node.data<=one.data)
		{
			new_node.next=one;
			last.next=new_node;
		}
		else if(new_node.data>last.data)
		{
			last.next=new_node;
			new_node.next=one;
		}
		else {
			
			n=one;
			while(n!=null)
			{
				if(new_node.data>n.data&&new_node.data<n.next.data)
				{
					new_node.next=n.next;
					n.next=new_node;
					break;
				}
				n=n.next;
			}
		
			
			
		}
	System.out.println("Inbetween");
				display(one);
		
	}
	
	public static void main(String args[])
	{
	
	InsertIntoSortedList p=new InsertIntoSortedList();
	Node one=new Node(1);
	Node two=new Node(2);
	Node three=new Node(3);
	Node four=new Node(6);
	Node five=new Node(8);
	
	one.next=two;
	two.next=three;
	three.next=four;
	four.next=five;
	five.next=one;
	p.display(one);
	Node insert1=new Node(9);
	p.insert(insert1, one);
	//p.display(one);
		
	}



}
