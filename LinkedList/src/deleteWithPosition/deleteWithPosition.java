package deleteWithPosition;



public class deleteWithPosition {
	
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
	
	public  void delWrtPos(int pos)
	{
		Node n=head;
		
		for(int i=0;n.next!=null&&i<pos-1;i++)
		{
			n=n.next;
		}
		Node del=n.next;
		n.next=del.next;
	}
	
	public static void main(String args[])
	{
		deleteWithPosition list=new deleteWithPosition();
		list.head=new Node(1);
		Node second=new Node(2);
		Node three=new Node(3);
		Node four=new Node(4);
		list.head.next=second;
		second.next=three;
		three.next=four;
		list.display();
		list.delWrtPos(2);
		list.display();
		
	}

}
