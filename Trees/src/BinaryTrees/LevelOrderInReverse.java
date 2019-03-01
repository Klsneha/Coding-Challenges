package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import BinaryTrees.LevelOrderTraversalPrint.Node;

public class LevelOrderInReverse {

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
	
	public void inorderTraversal(Node n)
	{
		if(n!=null)
		{
			inorderTraversal(n.left);
			System.out.println(n.key);
			inorderTraversal(n.right);
		}
	}
	
	public void  reverseTraverse(Node root)
	{
		Queue<Node> q=new LinkedList<Node>();
		Stack<Node> s=new Stack<Node>();
		
		q.add(root);
		Node cp=null;
		while(!q.isEmpty())
		{
			cp=q.remove();
			if(cp.right!=null)
				q.add(cp.right);
			if(cp.left!=null)
				q.add(cp.left);
			s.push(cp);
		}
		
		while(!s.isEmpty())
		{
			System.out.print(" "+s.pop().key);
		}
	}
	
	
	public static void main(String args[])
	{
		LevelOrderInReverse s=new LevelOrderInReverse();
		s.insert(s.root,10);
		s.insert(s.root,16);
		s.insert(s.root,5);
		s.insert(s.root,-3);
		s.insert(s.root,6);
		s.insert(s.root,11);
		s.inorderTraversal(s.root);
		s.reverseTraverse(s.root);
		
		
		
		
	}
}
