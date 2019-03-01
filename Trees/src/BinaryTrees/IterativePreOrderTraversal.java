package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import BinaryTrees.IterativePostOrderTRaversal.Node;

public class IterativePreOrderTraversal {
	
	Node root=null;
	class Node{
		int key;
		Node left;
		Node right;
		
		Node(int d)
		{
			this.key=d;
			left=right=null;
		}
	}
	
	public void insert(Node root,int key)
	{
	
		Queue<Node> q=new LinkedList<Node>();
		
		if(root==null)
		{
			this.root=new Node(key);
			return;
		}
		q.add(root);
		
		while(!q.isEmpty())
		{
		 Node temp=q.remove();
		 if(temp.left==null)
		 {
			 temp.left=new Node(key);
			 break;
		 }
		 else {
			 q.add(temp.left);
		 }
		 
		 if(temp.right==null)
		 {
			 temp.right=new Node(key);
			 break;
		 }
		 else
		 {
			 q.add(temp.right);
		 }
		}
		
	}
	
	public void prOrderTRaversal(Node root)
	{
		Stack<Node> s=new Stack<Node>();
		s.push(root);
		while(!s.isEmpty())
		{
			root=s.pop();
			System.out.println(root.key);
			if(root.right!=null)
				s.push(root.right);
			if(root.left!=null)
				s.push(root.left);
		}
	}
	
	public static void main(String args[])
	{
		IterativePreOrderTraversal i=new IterativePreOrderTraversal();
		i.insert(i.root,1);
		i.insert(i.root,-1);
		i.insert(i.root, 11);
		i.insert(i.root, -2);
		i.insert(i.root, -3);
		i.insert(i.root, 21);
		i.insert(i.root, 6);
		i.insert(i.root, 5);
		i.prOrderTRaversal(i.root);
	}


}
