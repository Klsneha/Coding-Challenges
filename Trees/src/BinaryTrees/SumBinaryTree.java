package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

import BinaryTrees.Insertion.Node;

public class SumBinaryTree {

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
	
	public boolean Sum(Node root, int sum)
	{
		if(root ==null)
			return false;
		if(root.left==null && root.right==null)
		{
			if(sum==root.key)
				return true;
			else
				return false;
				
		}
		
		/*if(root.right==null)
		{
			if(sum==root.key)
				return true;
			else
				return false;
		}
		*/
		return Sum(root.left,sum-root.key) || Sum(root.right,sum-root.key);
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
	
	public static void main(String args[])
	{
		SumBinaryTree s=new SumBinaryTree();
		s.insert(s.root,10);
		s.insert(s.root,16);
		s.insert(s.root,5);
		s.insert(s.root,-3);
		s.insert(s.root,6);
		s.insert(s.root,11);
		s.inorderTraversal(s.root);
		System.out.println(s.Sum(s.root,32));
		
	}
}