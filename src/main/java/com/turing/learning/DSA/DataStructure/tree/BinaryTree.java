package com.turing.learning.DSA.DataStructure.tree;

public class BinaryTree {
	
	Node root;
	
	BinaryTree(Node node)
	{
		this.root = node;
	}

	/*
	public Node search(int item) 
	{
		Node current = this.root;
		
		while ( current != null )
		{
			if (current.getValue() == item)
			{
				return current;
			}
			else if ( current.getValue() > item ) 
			{
				//go left child 
				current = current.getLeftChild();
			}
			else if ( current.getValue() < item ) 
			{
				//go right child 
				current = current.getRightChild();
			}
		}
		return null;
	}
	*/
	
	public Node BinaryTreeSearch( int item, Node current )
	{
		if ( current == null )
		{
			return null;
		}
		if ( current.getValue() == item )
		{
			return current;
		}
		else if( current.getValue() > item )
		{ 
			return this.BinaryTreeSearch(item, current.getLeftChild());
		}
		else if ( current.getValue() < item )
		{
			return this.BinaryTreeSearch(item, current.getRightChild());
		}
		return null;
	}
	
	public Node search(int item)
	{	
		return this.BinaryTreeSearch(item, root);
	}

	public Node insert(int item) 
	{
		Node insertNode = new Node( item );
		Node current = this.root;
		Node parent = null;
		while ( current != null )
		{
			parent = current;
			if ( current.getValue() > item )
			{
				current = current.getLeftChild();
			}
			else if ( current.getValue() < item )
			{
				current = current.getRightChild();
			}
		}
		if ( parent.getValue() > item )
		{
			// insert left child
			parent.setLeftChild(insertNode);
		}
		else if ( parent.getValue() < item )
		{
			// insert right child
			parent.setRightChild(insertNode);
		}
		
		return insertNode;
	}
}
