package BinaryTrees;

public class BinaryTreeWithInnerClass {

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
	
	
	public static void main(String args[])
	{
		//BinaryTreeWithInnerClass b=new BinaryTreeWithInnerClass();
		BinaryTreeWithInnerClass.root=new Node(1);
		BinaryTreeWithInnerClass.root.left=new Node(2);
		BinaryTreeWithInnerClass.root.right=new Node(3);
		BinaryTreeWithInnerClass.root.left.left=new Node(4);
	}
}
