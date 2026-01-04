package com.turing.learning.DSA.DataStructure.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class PostOrderTraversalWithTwoStack implements BinaryTreeTraversal{
	
	BinaryTree tree;
	ArrayList<Node> list;
	PostOrderTraversalWithTwoStack(BinaryTree tree)
	{
		this.tree = tree;
	}

	@Override
	public Iterator<Node> iterator() {
		
		return new TreeTraversal();
	}
	
	public void postOrderTraversal() 
	{
		Node current = this.tree.root;
		this.postOrderTraversal(current);
	}
	
	private void postOrderTraversal(Node current) 
	{
		Stack<Node> stack1 = new Stack<>();
		Stack<Node> result = new Stack<>();	
		
		stack1.push(current);
		while ( !stack1.isEmpty() )
		{
			Node item = stack1.pop();
			result.push(item);
			
			if( item.getLeftChild() != null )
			{
				stack1.push(item.getLeftChild());
			}
			if( item.getRightChild() != null )
			{
				stack1.push(item.getRightChild());
			}
		}
		
		while( !result.isEmpty() )
		{
			Node postOrderItem = result.pop();
			list.add(postOrderItem);
		}
	}

	class TreeTraversal implements Iterator<Node>
	{
		int currentIndex = 0;
		TreeTraversal()
		{	
			list = new ArrayList<>();
			postOrderTraversal();
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
