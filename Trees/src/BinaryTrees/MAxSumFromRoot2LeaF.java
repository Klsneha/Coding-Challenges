package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

import BinaryTrees.SumBinaryTree.Node;

public class MAxSumFromRoot2LeaF {
	
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
	
	public int maxSum(Node root)
	{
		if(root==null)
			return 0;
		if(root.left==null && root.right==null)
		{
			return root.key;
		}
		else
		{
			if(maxSum(root.left)>maxSum(root.right))
			{
				int sum=root.key+maxSum(root.left);
				return sum;
			}
			else
			{
				
				int sum= root.key+maxSum(root.right);
				return sum;
			}
		}
	}
	public static void main(String args[])
	{
		MAxSumFromRoot2LeaF s=new MAxSumFromRoot2LeaF();
		s.insert(s.root,10);
		s.insert(s.root,16);
		s.insert(s.root,5);
		s.insert(s.root,-3);
		s.insert(s.root,6);
		s.insert(s.root,11);
		s.inorderTraversal(s.root);
		System.out.println(s.maxSum(s.root));
		
		
	}

}
