package com.ashish.learning.linkedlist;

public class BST {
// Addig test comment 1
// Adding test comment 2 and creating new branch
	public static void main(String[] args) {
		
		BST bst=new BST();
		int val = 0;
		if (root==null)
		bst.insert( root,  val)
		{
			
		}
bst.createNewNode(val);

	}


static Node createNewNode(int val)
{
	Node n=new Node();
	n.data=val;
	n.left=null;
	n.right=null;
	return n;
}

static Node insert(Node node, int val)
{
	if (node==null)
	{
		createNewNode(val);
		
	}
	
	else 
	{
		if(val<node.data)
		{
			node.left=insert(node.left,val)
		}
	}
}

}
