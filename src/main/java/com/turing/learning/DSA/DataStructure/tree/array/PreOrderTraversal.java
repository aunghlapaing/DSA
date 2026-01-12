package com.turing.learning.DSA.DataStructure.tree.array;

import java.util.ArrayList;
import java.util.Iterator;

public class PreOrderTraversal implements BinaryTreeTraversal{
	
	BinaryTreeWithArray binaryTree;
	ArrayList<Integer> list;
	PreOrderTraversal(BinaryTreeWithArray tree)
	{
		this.binaryTree = tree;
	}

	@Override
	public Iterator<Integer> iterator() {
		
		return new TreeTraversal();
	}
	
	public void preOrderTraversal()
	{
		int index = 0;
		this.preOrderTraversal(index);
	}
	
	public void preOrderTraversal(int index)
	{
		
		Integer current = this.binaryTree.tree[index];
		// root
		if ( current != null )
		{
			list.add( current );
		}
		else
		{
			return;
		}
	
		// left child
		this.preOrderTraversal( (index * 2) + 1 );
		
		// right child
		this.preOrderTraversal( (index * 2) + 2 );
		
	}
	
	class TreeTraversal implements Iterator<Integer>
	{
		int currentIndex = 0;
		TreeTraversal()
		{
			list = new ArrayList<>();
			preOrderTraversal();
		}

		@Override
		public boolean hasNext() 
		{
			return currentIndex <= list.size() - 1;
		}

		@Override
		public Integer next() 
		{
			return list.get(currentIndex++);
		}
		
	}
}
