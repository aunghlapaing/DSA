package com.turing.learning.DSA.DataStructure.tree;

import java.util.ArrayList;
import java.util.Iterator;

public class InOrderTraversal implements BinaryTreeTraversal {
	
	BinaryTree tree;
	ArrayList<Node> list; 
	
	InOrderTraversal( BinaryTree tree)
	{
		this.tree = tree;
	}

	@Override
	public Iterator<Node> iterator() {
		
		return new TreeTraversal();
	}
	
	public void traversalInOrder()
	{
		Node current = this.tree.root;
		this.traversalInOrder(current);
	}
	
	
	private void traversalInOrder(Node current) 
	{
		if ( current.getLeftChild() != null )
		{
			this.traversalInOrder(current.getLeftChild());
		}
		if ( current != null )
		{
			System.out.println("Node :" + current.getValue());
			list.add(current);
		}
		if ( current.getRightChild() != null )
		{
			this.traversalInOrder(current.getRightChild());
		}
		
	}


	class TreeTraversal implements Iterator<Node>
	{
		int currentIndex = 0;
		TreeTraversal()
		{
			list = new ArrayList<Node>();
			traversalInOrder();
		}

		@Override
		public boolean hasNext() {
			
			return currentIndex <= list.size() - 1;
		}

		@Override
		public Node next() {
			
			return list.get(currentIndex++);
		}
		
	}

}
