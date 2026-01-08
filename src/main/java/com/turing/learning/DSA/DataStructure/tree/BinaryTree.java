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
	
		// DeleteNode has no child or has child and itself is root
		if ( !hasDeleteNodeParent(deleteNode) )
		{
			deleteRoot(deleteNode);
		}	
		// DeleteNode can has either left child or right child / both and it has parent and itself is subtree
		else if ( !isLeaf(deleteNode) && hasDeleteNodeParent(deleteNode) ) 
		{
			deleteSubTree(deleteNode);
		}
		// DeleteNode is leaf node and it has parent
		else 
		{
			deleteLeaf(deleteNode);
		}
		return deleteNode;
	}

	public void deleteRoot(Node deleteNode) {
		if ( isLeaf(deleteNode) )
		{
			this.root = null;
		}
		else
		{
			Node successor = this.getSuccessor(deleteNode);
			Node successorRightChild = successor.getRightChild();
		
			if ( successor.getValue() > deleteNode.getValue()  ) // right child
			{
				this.root = successor;

				root.setRightChild(deleteNode.getRightChild());
				
				//System.out.println("Root Right Child : " + root.getRightChild().getValue());
				
				//System.out.println("successor: " + successor.getValue());
				
				//System.out.println("successor's Right child: " + successorRightChild.getValue());
				
				// check successor can have right child
				if (successor.getRightChild() != null)
				{
					Node successorParent = successor.getParent();
					//System.out.println("successor's parent : " + successorParent.getValue());
					
					successorParent.setLeftChild(successorRightChild);
					//System.out.println("successor's parent left Child : " + successorParent.getLeftChild().getValue());
				}
			}
			else
			{
				this.root = successor;
			}
		}
	}

	public void deleteSubTree(Node deleteNode) {
		Node deleteNodeParent = deleteNode.getParent();
		Node successor = this.getSuccessor(deleteNode);
		
		// deleteNode is right child of subtree and need to set RightChild
		if ( deleteNode.getValue() > deleteNodeParent.getValue() ) 
		{
			deleteNodeParent.setRightChild(successor);
			
		}

		// deleteNode is left child of subtree and need to set LeftChild
		else 
		{
			deleteNodeParent.setLeftChild(successor);
		}
	}

	public void deleteLeaf(Node deleteNode) {
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
	
	public Node getSuccessor(Node deleteNode)
	{
		Node successor = null;
		
		if ( deleteNode.getRightChild() != null )
		{
			successor = deleteNode.getRightChild();
			while ( successor.getLeftChild() != null )
			{
				successor = successor.getLeftChild();
			}
			//System.out.println("After while successor : " + successor.getValue());
		}
		else
		{
			successor = deleteNode.getLeftChild();
			//System.out.println("After while successor : " + successor.getValue());
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
