package com.turing.learning.DSA.DataStructure.tree;

public class BinaryTree {
	
	Node root;
	
	BinaryTree()
	{
		
	}

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
		if ( root == null )
		{
			 this.root = insertNode;
		}
		else 
		{
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
		}
		
		return insertNode;
	}

	public Node findMinNode() 
	{
		Node current = this.root;
		while ( current.leftChild != null )
		{
			current = current.getLeftChild();
		}
		return current;
	}

	public Node findMaxNode() 
	{
		Node current = this.root;
		while ( current.getRightChild() != null )
		{
			current = current.getRightChild();
		}
		return current;
	}

	public Node delete(int item) 
	{
		Node deleteNode =  search(item);
		System.out.println("Delete Node: " + deleteNode.getValue());
	
		
		// root node has no child
		if ( isLeaf(deleteNode) && !hasDeleteNodeParent(deleteNode) )
		{
			this.root = null;
		}
		
		// has either left child or right child and has parent
		else if ( !isLeaf(deleteNode) && hasDeleteNodeParent(deleteNode) ) 
		{
			//this.getSuccessor(deleteNode);
		}
		// leaf node and has parent
		else 
		{
			Node deleteNodeParent = deleteNode.getParent();
			if ( deleteNode.getValue() > deleteNodeParent.getValue() ) // right child
			{
				deleteNodeParent.rightChild = null;
			}
			else // left child
			{
				deleteNodeParent.leftChild = null;
			}
		}
		
		return deleteNode;
	}
	
	public Node getSuccessor(Node deleteNode)
	{
		Node successor = null;
		
		// deleteNode has right child and set the deleteNode right most left child as successor
		if ( deleteNode.getRightChild() != null ) 
		{
			successor = deleteNode.getRightChild();
			while ( successor.getLeftChild() != null )
			{
				successor = successor.getLeftChild();
			}
		}
        
		// deleteNode only has left child and set it as successor
		else
		{
			successor = deleteNode.getLeftChild();
		}
		return successor;
	}

	public Boolean hasDeleteNodeParent(Node deleteNode) 
	{
		return deleteNode.getParent() != null;
	}
	
	public boolean isLeaf(Node deleteNode) 
	{
		return deleteNode.getLeftChild() == null && deleteNode.getRightChild() == null;
	}
				
}
