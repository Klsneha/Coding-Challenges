package SingleLinkedList;

public class Soluttion {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
		}
	}
	
	public void printList() {
		Node n=head;
		while(n	!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	public static void main(String args[])
	{
		Soluttion s=new Soluttion();
		s.head= s.new Node(1);
		Node two=s.new Node(2);
		Node three=s.new Node(3);
		
		s.head.next=two;
		two.next=three;
		
		s.printList();
	}
}