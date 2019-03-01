package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

import BinaryTrees.Insertion.Node;

public class DeleteNode {

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
	
	public void inorderTraversal(Node n)
	{
		if(n!=null)
		{
			inorderTraversal(n.left);
			System.out.println(n.key);
			inorderTraversal(n.right);
		}
	}
	
	public void search(Node root, int key)
	{
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		Node Key_remove=null;
		Node temp=null;
		while(!q.isEmpty())
		{
			temp=q.remove();
			if(temp.key==key)
			{
				Key_remove=temp;
				
			}
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
			
		}
		System.out.println(Key_remove.key);
		System.out.println(temp.key);
		
		Key_remove.key=temp.key;
		//return Key_remove;
		
		Queue<Node> q1=new LinkedList<Node>();
		q1.add(root);
		while(!q1.isEmpty())
		{
			Node node_remove=q1.remove();
			if(node_remove.right.key==temp.key)
			{
				node_remove.right=null;
			}
			else
			{
				q1.add(node_remove.right);
			}
		}
	}
	
	public void delete(Node n)
	{
		
	}
	
	
	
	public static void main(String args[])
	{
		DeleteNode i=new DeleteNode();
		i.root=new Node(10);
		i.root.left=new Node(11);
		//i.root.left.left=new Node(7);
		//i.root.left.right=new Node(5);
		i.root.right=new Node(9);
		//i.root.right.left=new Node(15);
		//i.root.right.right=new Node(8);
		
		i.inorderTraversal(i.root);
		System.out.println("fdsfsdf");
		i.search(i.root, 10);
		System.out.println("after insertion");
		i.inorderTraversal(i.root);
	}
}
