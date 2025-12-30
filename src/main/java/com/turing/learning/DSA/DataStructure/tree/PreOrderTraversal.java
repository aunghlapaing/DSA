package com.turing.learning.DSA.DataStructure.tree;

import java.util.ArrayList;
import java.util.Iterator;

public class PreOrderTraversal implements BinaryTreeTraversal {
	
	BinaryTree tree;
	ArrayList<Node> list;
	
	PreOrderTraversal(BinaryTree tree)
	{
		this.tree = tree;
	}

	@Override
	public Iterator<Node> iterator() {
		
		return new TreeIterator();
	}
	
	public void traversalPreOrder()
	{
		Node current = this.tree.root;
		this.traversalPreOrder(current);
	}
	
	public void traversalPreOrder(Node node) 
	{
		
		if ( node != null )
		{
			System.out.println("Node :" + node.getValue());
			list.add(node);
		}
		if ( node.getLeftChild() != null )
		{
			this.traversalPreOrder(node.getLeftChild());
		}
		if ( node.getRightChild() != null )
		{
			this.traversalPreOrder(node.getRightChild());
		}
	}
	
	class TreeIterator implements Iterator<Node>
	{
		int currentIndex = 0;
		TreeIterator(){
			list = new ArrayList<Node>();
			traversalPreOrder();
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
