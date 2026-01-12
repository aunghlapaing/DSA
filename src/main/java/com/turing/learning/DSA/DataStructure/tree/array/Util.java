package com.turing.learning.DSA.DataStructure.tree.array;

import java.util.ArrayList;

public class Util {
	
	BinaryTreeWithArray binaryTree;
	ArrayList<Integer> list = new ArrayList<>();
	
	public Util(BinaryTreeWithArray tree)
	{
		this.binaryTree = tree;
	}
	
	public ArrayList<Integer> isBinaryTree() 
	{
		int index = 0;
		inOrderTraversal( index );
		return list;
	}

	private void inOrderTraversal(int index) 
	{
		Integer current = this.binaryTree.tree[index];
		if ( current != null )
		{
			this.inOrderTraversal((index * 2) + 1);
		}

		if ( current != null )
		{
			list.add(current);
		}
		
		if ( current != null )
		{
			this.inOrderTraversal(( index * 2 ) + 2);
		}
	}

}
