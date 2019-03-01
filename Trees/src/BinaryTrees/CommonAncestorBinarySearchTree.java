package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import BinaryTrees.SprialBinaryTree.Node;

public class CommonAncestorBinarySearchTree {

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
	
	public Node findAncestor(Node root,int n1, int n2)
	{
		if(n1<root.key && n2>root.key)
		{
			return root;
		}
		
		if(n1>root.key && n2>root.key)
			return findAncestor(root.right,n1,n2);
		else 
			return findAncestor(root.left,n1,n2);
		
		
	}
	
	
	
	
	
	public static void main(String args[])
	{
		CommonAncestorBinarySearchTree s=new CommonAncestorBinarySearchTree();
		s.insert(s.root,10);
		s.insert(s.root,-10);
		s.insert(s.root,30);
		s.insert(s.root,-5);
		s.insert(s.root,8);
		s.insert(s.root,25);
		s.insert(s.root,60);
		s.insert(s.root,-8);
		s.insert(s.root,-3);
		s.insert(s.root,6);
		s.insert(s.root,9);
		s.inorderTraversal(s.root);
	System.out.println(s.findAncestor(s.root, 6, 78).key);
		
		
		
		
		
		
	}
}