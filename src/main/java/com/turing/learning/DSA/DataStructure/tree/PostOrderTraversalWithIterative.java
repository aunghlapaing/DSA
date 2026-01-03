package com.turing.learning.DSA.DataStructure.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class PostOrderTraversalWithIterative implements BinaryTreeTraversal{
	
	BinaryTree tree;
	ArrayList<Node> list;
	PostOrderTraversalWithIterative(BinaryTree tree)
	{
		this.tree = tree;
	}

	@Override
	public Iterator<Node> iterator() {
		
		return new TreeTraversal();
	}
	
	public void traversalPostOrder()
	{
		Node current = tree.root;
		this.traversalPostOrder(current);
	}
	
	private void traversalPostOrder(Node current) 
	{
		Stack<Node> stack = new Stack<>();
		
		// push root
		stack.push(current);
		
		// go left child
		if ( current.getLeftChild() != null )
		{
			// push left child and traverse current
			current = current.getLeftChild();
			stack.push(current);
			while ( current != null && ( current.getRightChild() != null || current.getLeftChild() != null ) )
			{
				if ( current.getRightChild() != null )
				{
					stack.push(current.getRightChild());
				}
				if ( current.getLeftChild() != null )
				{
					stack.push(current.getLeftChild());
				}
				current = current.getLeftChild();
			}
			
			System.out.println( "Current after while:" + current.getValue() );
			
			// pop from stack until stack.size > 0 and change current
			while ( stack.size() > 1 )
			{
				System.out.println( "Stack size :" + stack.size() );
				current = stack.pop();
				list.add(current);
				System.out.println( "Node :" + current.getValue() );
			}
			
		}
		// pop the last element from stack and push back
		current = stack.peek();
				
		System.out.println( "After left child current :" + current.getValue() );
		
		// go right child
		if ( current.getRightChild() != null )
		{
			current = current.getRightChild();
			stack.push(current);
			
			while( current != null && ( current.getLeftChild() != null || current.getRightChild() != null ) )
			{
				if ( current.getRightChild() != null )
				{
					stack.push(current.getRightChild());
				}
				if ( current.getLeftChild() != null )
				{
					stack.push(current.getLeftChild());
				}
				current = current.getLeftChild();
			}
			
			// pop from stack until stack.size > 0 and change current
			while ( stack.size() > 1 )
			{
				System.out.println( "Stack size :" + stack.size() );
				current = stack.pop();
				list.add(current);
				System.out.println("Node :" + current.getValue());
			}
		}
		
		// pop the last element from stack and add to list
		current = stack.pop();
		System.out.println("Node :" + current.getValue());
		list.add(current);
		
		System.out.println( "Stack size :" + stack.size() );
	}

	class TreeTraversal implements Iterator<Node>
	{
		int currentIndex = 0;
		TreeTraversal()
		{
			list = new ArrayList<>();
			traversalPostOrder();
		}

		@Override
		public boolean hasNext() 
		{
			return currentIndex <= 0;
		}

		@Override
		public Node next() 
		{			
			return list.get(currentIndex++);
		}
		
	}
	
	

}
