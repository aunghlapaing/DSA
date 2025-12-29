package com.turing.learning.DSA.DataStructure.tree;

public class BinaryTree {
	
	Node root;
	
	BinaryTree(Node node)
	{
		this.root = node;
	}

	public Node search(int item) 
	{
		Node current = this.root;
		
		while ( current != null )
		{
			if (current.getValue() == item)
			{
				return current;
			}
			else if ( current.getValue() > item ) /* go left child */
			{
				current = current.getLeftChild();
			}
			else if ( current.getValue() < item ) /* go right child */
			{
				current = current.getRightChild();
			}
		}
		return null;
	}

}
