package com.turing.learning.DSA.DataStructure.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class PreOrderTraversalWithIterative implements BinaryTreeTraversal{
	
	BinaryTree tree;
	ArrayList<Node> list;
	PreOrderTraversalWithIterative(BinaryTree tree)
	{
		this.tree = tree;
	}

	@Override
	public Iterator<Node> iterator() {
		
		return new TreeTraversal();
	}
	
	public void traversalPreOrder()
	{
		Node current = this.tree.root;
		this.traversalPreOrder(current);
	}
	
	private void traversalPreOrder(Node current) 
	{
		Stack<Node> stack = new Stack<>();
		while ( current != null )
		{
			list.add(current);
			
			
			if (current.getRightChild() != null)
			{
				stack.push(current.getRightChild());
			}
			
			if ( current.getLeftChild() != null )
			{
				stack.push(current.getLeftChild());
				current = current.getLeftChild();
			}
			
			if ( !stack.isEmpty() )
			{
				current = stack.pop();
			}
			else
			{
				break;
			}
		}
		
	}

	class TreeTraversal implements Iterator<Node>
	{
		int currentIndex = 0;
		TreeTraversal()
		{
			list = new ArrayList<>();
			traversalPreOrder();
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
