package BinaryTrees;

import BinaryTrees.Insertion.Node;

public class SizeofTree {
	
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
	
	public int sizeOfTree(Node n)
	{
		if(n==null)
			return 0;
		else
		{
			return 1+sizeOfTree(n.left)+sizeOfTree(n.right);
		}
		
	}
	
	public static void main(String args[])
	{
		SizeofTree i=new SizeofTree();
		i.root=new Node(10);
		i.root.left=new Node(11);
		i.root.left.left=new Node(7);
		i.root.left.right=new Node(5);
		i.root.right=new Node(9);
		i.root.right.left=new Node(15);
		i.root.right.right=new Node(8);
		
		System.out.println(i.sizeOfTree(i.root));
		
	}

}
