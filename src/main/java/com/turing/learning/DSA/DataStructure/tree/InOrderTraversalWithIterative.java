package com.turing.learning.DSA.DataStructure.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class InOrderTraversalWithIterative implements BinaryTreeTraversal{
	
	BinaryTree tree;
	ArrayList<Node> list;
	InOrderTraversalWithIterative(BinaryTree tree)
	{
		this.tree = tree;
	}
	
	@Override
	public Iterator<Node> iterator() {
		
		return new TreeTraversal();
	}
	
	public void TraversalInOrder()
	{
		Node current = this.tree.root;
		this.TraversalInOrder(current);
	}
	
	private void TraversalInOrder(Node current) 
	{
		Stack<Node> stack = new Stack<>();
		
		while ( current != null || !stack.isEmpty() )
		{
			while ( current != null )
			{
				stack.push(current);
				current = current.getLeftChild();
			}
			
			// pop and add to list
			current = stack.pop();
			list.add(current);
			
			System.out.println("Node :" + current.getValue());
			
			// traverse right child
			current = current.getRightChild();
		}
		
	}

	class TreeTraversal implements Iterator<Node>
	{
		
		int currentIndex = 0;
		TreeTraversal()
		{
			list = new ArrayList<>();
			TraversalInOrder();
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
