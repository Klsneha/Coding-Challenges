package lengthOfLoop;

import java.util.*;
public class LengthOfLoop {

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
	
	public void lengthOfLoop()
	{
		HashSet list=new HashSet();
		ArrayList arr=new ArrayList();
		Node n=head;
		list.add(n);
		arr.add(n);
		while(n.next!=null)
		{
			if(list.contains(n.next))
			{
				//list.add(n.next);
				arr.add(n.next);
				break;
			}
			else
			{
				list.add(n.next);
				arr.add(n.next);
				n=n.next;
			}
			
		}
		
		Iterator<Node> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().data);
		}
		System.out.println("******");
		Iterator<Node> it1=arr.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next().data);
		}
		
		
		
		
	}
	
	public static void main(String args[])
	{
		LengthOfLoop d=new LengthOfLoop();
		d.head=new Node(1);
		Node two=new Node(2);
		Node three=new Node(3);
		Node four=new Node(4);
		Node five=new Node(5);
		
		d.head.next=two;
		two.next=three;
		three.next=four;
		four.next=five;
		five.next=two;
		
		d.lengthOfLoop();
		
		
	}
}
