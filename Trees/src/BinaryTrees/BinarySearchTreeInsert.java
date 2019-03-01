package BinaryTrees;

import BinaryTrees.BinaryTreeWithInnerClass.Node;

public class BinarySearchTreeInsert {

	static Node root;
	public static class Node{
		int key;
		Node left,right;
		Node(int data)
		{
			key=data;
			left=right=null;
		}
		Node(){
			root=null;
		}
	}
	
	public Node insert(Node root,int key)
	{
		if(root==null)
		{
			root=new Node(key);
			
		}
		else if(root.key<key)
			root.right=insert(root.right,key);
		else
			root.left= insert(root.left,key);
		return root;
	}
	
	
	public void inOrderTRavsersal(Node root) {
		if(root==null)
			return;
		else
		{
			inOrderTRavsersal(root.left);
		System.out.println(root.key);
		inOrderTRavsersal(root.right);
		}
	}
	
	
	public static void main(String args[])
	{
		BinarySearchTreeInsert b=new BinarySearchTreeInsert();
		b.root=new Node(10);
		b.insert(root, -5);
		b.insert(root, 30);
		b.insert(root, -10);
		b.insert(root, 0);
		b.insert(root, 5);
		b.insert(root, 20);
		b.insert(root, 36);
		
		b.inOrderTRavsersal(b.root);
		System.out.println("**");
		b.insert(root, -4);
		b.inOrderTRavsersal(b.root);
		System.out.println("**");
		b.insert(b.root, 25);
		b.inOrderTRavsersal(b.root);
	}
}