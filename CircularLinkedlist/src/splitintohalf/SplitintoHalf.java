package splitintohalf;


public class SplitintoHalf {
	
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
	
	public void split(Node one)
	{
		Node n=one;
		Node last=null;
		double count=0;
				if(n!=null)
				{
					do {
						count=count+1;
						last=n;
						n=n.next;
					}while(n!=one);
				}
			
		int first=(int)Math.ceil(count/2);
		n=one;
		count=1;
		Node second=null;
		while(n!=null)
		{
			if(count==first)
			{
				second=n.next;
				n.next=one;
				last.next=second;
				break;
				
			}
			n=n.next;
			count=count+1;
		}
		display(one);
		System.out.println("*********");
		display(second);
		
		
		
	}
	
	public static void main(String args[])
	{
	
	SplitintoHalf p=new SplitintoHalf();
	Node one=new Node(1);
	Node two=new Node(2);
	Node three=new Node(3);
	Node four=new Node(4);
	//Node five=new Node(5);
	
	one.next=two;
	two.next=three;
	three.next=four;
	four.next=one;
	//five.next=one;
	p.display(one);
	p.split(one);
	//p.display(one);
		
	}


}
