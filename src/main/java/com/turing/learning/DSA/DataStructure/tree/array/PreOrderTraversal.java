package com.turing.learning.DSA.DataStructure.tree.array;

import java.util.Iterator;

public class PreOrderTraversal implements BinaryTreeTraversal{
	
	BinaryTreeWithArray tree;
	PreOrderTraversal(BinaryTreeWithArray tree)
	{
		this.tree = tree;
	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new TreeTraversal();
	}
	
	class TreeTraversal implements Iterator<Integer>
	{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Integer next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}
