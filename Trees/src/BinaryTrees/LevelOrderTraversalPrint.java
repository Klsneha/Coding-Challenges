package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import BinaryTrees.MAxSumFromRoot2LeaF.Node;

public class LevelOrderTraversalPrint {
	
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
	
	public void printTree(Node root)
	{
		Queue<Node> s=new LinkedList<Node>();
		s.add(root);
		s.add(null);
		
		boolean flag=false;
		while(!s.isEmpty())
		{
			if(s.peek()==null)
			{
				System.out.println();
			    s.remove();
			    s.add(null);
			    if(flag)
			    	break;
			    flag=true;
			    
			}
			else
			{
				root=s.remove();
				System.out.print(" "+root.key);
				if(root.left==null && root.right==null)
					continue;
				if(root.left!=null)
					s.add(root.left);
				if(root.right!=null)
					s.add(root.right);
				flag=false;
				
			}
				
		}
		
	}
	
	
	public static void main(String args[])
	{
		LevelOrderTraversalPrint s=new LevelOrderTraversalPrint();
		s.insert(s.root,10);
		s.insert(s.root,16);
		s.insert(s.root,5);
		s.insert(s.root,-3);
		s.insert(s.root,6);
		s.insert(s.root,11);
		s.inorderTraversal(s.root);
		s.printTree(s.root);
		
		
		
	}


}
