package com.turing.learning.DSA.DataStructure.tree.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Util {
	
	BinaryTreeWithArray binaryTree;
	
	Integer[] treeList = { 17, 15, null, 35 };
	
	ArrayList<Integer> list = new ArrayList<>();
	
	Util(  )
	{
		
	}
	
	Util(BinaryTreeWithArray tree)
	{
		this.binaryTree = tree;
	}
	
	public boolean isBinaryTree() 
	{
		int index = 0;

		// empty case
		if ( this.binaryTree.tree[index] != null )
		{
			inOrderTraversal( index );
			
			System.out.println( "TREE AFTER TRAVERSAL :" + list.toString() );
			return isSortedArray(list);
		}
		else
		{
			return false;
		}
	}

	private void inOrderTraversal(int index) 
	{
		if ( index <= this.binaryTree.tree.length - 1 )
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
	
	public Integer[] removeNull(Integer[] tree)
	{
		int count = 0;
		for ( int i = 0 ; i < tree.length; i ++ )
		{
			if ( tree[i] != null )
			{
				count++;
			}	
		}
		
		Integer[] trimTree = new Integer[count];
		int index = 0;
		
		for ( int i = 0; i < tree.length; i++ )
		{
			if ( tree[i] != null )
			{
				trimTree[index++] = tree[i];
			}
		}
		
		return trimTree;
	}

}
