package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import BinaryTrees.IsBinaryTree.Node;

public class IterativePostOrderTRaversal {

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
	
	public void postOrder(Node root) {
		Stack<Node> s1=new Stack<Node>();
		Stack<Node> s2=new Stack<Node>();
		
		s1.push(root);
		while(!s1.isEmpty())
		{
			root=s1.pop();
			s2.push(root);
			if(root.left!=null)
				s1.push(root.left);
			if(root.right!=null)
				s1.push(root.right);
		}
		
		while(!s2.isEmpty())
		{
			Node p=s2.pop();
			System.out.println(p.key);
		}
	}
	
	public static void main(String args[])
	{
		IterativePostOrderTRaversal i=new IterativePostOrderTRaversal();
		i.insert(i.root,1);
		i.insert(i.root,-1);
		i.insert(i.root, 11);
		i.insert(i.root, -2);
		i.insert(i.root, -3);
		i.insert(i.root, 21);
		i.insert(i.root, 6);
		i.insert(i.root, 5);
		i.postOrder(i.root);
	}

}
