package com.turing.learning.DSA.DataStructure.tree.array;

import java.util.ArrayList;
import java.util.Arrays;

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
		//String result = Arrays.toString(treeList);
		//System.out.println( "TREE BEFORE TRAVERSAL :" + result );
		
		int index = 0;
		inOrderTraversal( index );
	
		System.out.println( "TREE AFTER TRAVERSAL :" + list.toString() );
		return isSortedArray(list);
	}

	private void inOrderTraversal(int index) 
	{
		if ( index <= treeList.length - 1 )
		{
			Integer current = this.binaryTree.tree[index];
			//Integer current = treeList[index];
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

}
