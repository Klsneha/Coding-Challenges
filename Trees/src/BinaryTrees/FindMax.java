package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

import BinaryTrees.Insertion.Node;

public class FindMax {

	Node root;
	static class Node{
		int key;
		Node left,right;
		
		Node(int d)
		{
			key=d;
			left=right=null;
		}
	}
	
	public void find(Node n)
	{
		
		Queue<Node> q=new LinkedList<Node>();
		q.add(n);
		int max=0;
		while(!q.isEmpty())
		{
			Node temp=q.remove();
			if(max<temp.key)
				max=temp.key;
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
		
		System.out.println("highest "+max);
		
	}
	public static void main(String args[])
	{
		FindMax i=new FindMax();
		i.root=new Node(10);
		i.root.left=new Node(11);
		i.root.left.left=new Node(7);
		//i.root.left.right=new Node(5);
		i.root.right=new Node(9);
		i.root.right.left=new Node(15);
		i.root.right.right=new Node(8);
		
		i.find(i.root);
	}
}
