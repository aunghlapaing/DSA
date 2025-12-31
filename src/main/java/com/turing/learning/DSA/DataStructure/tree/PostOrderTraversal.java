package com.turing.learning.DSA.DataStructure.tree;

import java.util.ArrayList;
import java.util.Iterator;

public class PostOrderTraversal implements BinaryTreeTraversal {
	
	BinaryTree tree;
	ArrayList<Node> list;
	PostOrderTraversal(BinaryTree tree)
	{
		this.tree = tree;
	}
	

	@Override
	public Iterator<Node> iterator() {
		
		return new TreeIterator();
	}
	
	public void traversalPostOrder() 
	{
		Node current = this.tree.root;
		this.traversalPostOrder(current);
		
	}
	
	private void traversalPostOrder(Node current)
	{
		if ( current.getLeftChild() != null )
		{
			this.traversalPostOrder(current.getLeftChild());
		}
		if ( current.getRightChild() != null )
		{
			this.traversalPostOrder(current.getRightChild());
		}
		if ( current != null )
		{
			list.add(current);
			System.out.println("Node :" + current.getValue());
		}
	}
	
	class TreeIterator implements Iterator<Node>
	{
		int currentIndex = 0;
		TreeIterator()
		{
			list = new ArrayList<Node>();
			traversalPostOrder();
		}

		@Override
		public boolean hasNext() 
		{
			return currentIndex <= list.size() - 1;
		}

		@Override
		public Node next() 
		{
			return list.get(currentIndex++);
		}
		
	}
	

}
