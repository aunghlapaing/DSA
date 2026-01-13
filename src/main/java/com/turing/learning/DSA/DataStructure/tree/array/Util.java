package com.turing.learning.DSA.DataStructure.tree.array;

import java.util.ArrayList;

public class Util {
	
	BinaryTreeWithArray binaryTree;
	ArrayList<Integer> list = new ArrayList<>();
	
	public Util(BinaryTreeWithArray tree)
	{
		this.binaryTree = tree;
	}
	
	public boolean isBinaryTree() 
	{
		int index = 0;
		inOrderTraversal( index );
		return isSortedArray(list);
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
	
	public boolean isSortedArray(ArrayList<?> list)
	{
		// sort check
		Integer[] arr = new Integer[list.size()];
		list.toArray(arr);
		
		if ( arr.length > 0 )
		{
			for ( int i = 0; i < arr.length - 1; i++ )
			{
				if ( arr[i] > arr[i+1] )
				{
					return false;
				}			
			}
			return true;
		}
		
		return false;
		
	}

}
