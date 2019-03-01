package BinaryTrees;

class Node{
	int key;
	Node left,right;
	Node(int item)
	{
		key=item;
		left=null;
		right=null;
	}
}
public class CreateTree {

	Node root;
	CreateTree(int key)
	{
		root=new Node(key);
	}
	CreateTree(){
		root=null;
	}
	
	public static void main(String args[])
	{
		CreateTree t=new CreateTree(1);
		t.root.left=new Node(2);
		t.root.right=new Node(3);
		t.root.left.left=new Node(4);
		
	}
}
