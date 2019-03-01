package DetectingLoops;
import java.util.*;

public class DetectingLoopsinLl {
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
	
	public boolean detectLoop()
	{
		HashSet h=new HashSet();
		Node n=head;
		boolean flag=false;
		
		while(n.next!=null)
		{
			if(h.contains(n.next))
			{
				 flag=true;
				 break;
			}
			else
			{
				h.add(n.next);
				n=n.next;
			}
		}
		return flag;
		
	}
	
	
	public static void main(String args[])
	{
		DetectingLoopsinLl d=new DetectingLoopsinLl();
		d.head=new Node(1);
		Node two=new Node(2);
		Node three=new Node(3);
		Node four=new Node(4);
		//Node five=new Node(5);
		
		d.head.next=two;
		two.next=three;
		three.next=four;
		//four.next=five;
		//five.next=two;
		System.out.println(d.detectLoop());
		
	}

}
