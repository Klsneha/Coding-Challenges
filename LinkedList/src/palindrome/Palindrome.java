package palindrome;

import java.util.Stack;

public class Palindrome {
	
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
	
	
	public void PalindromeCheck()
	{
		Stack st=new Stack();
		Node n=head;
		while(n.next!=null)
		{
			st.push(n.data);
			n=n.next;
		}
		st.push(n.data);
		System.out.println(st);
		n=head;
		boolean flag=true;
		while(n.next!=null)
		{
			if((Integer)n.data==st.pop())
			{
				n=n.next;
			}
			else
			{
				flag=false;
				break;
			}
				
		}
		if(flag)
		{
			System.out.println("it is a palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		
	}
	public static void main(String args[])
	{
		Palindrome p=new Palindrome();
	p.head=new Node(1);
	Node two=new Node(2);
	Node three=new Node(3);
	Node four=new Node(2);
	Node five=new Node(1);
	
	p.head.next=two;
	two.next=three;
	three.next=four;
	four.next=five;
	p.PalindromeCheck();
	}

}
