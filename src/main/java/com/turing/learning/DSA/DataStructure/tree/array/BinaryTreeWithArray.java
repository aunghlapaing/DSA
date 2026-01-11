package com.turing.learning.DSA.DataStructure.tree.array;

public class BinaryTreeWithArray {
	Integer[] tree = new Integer[20];	
	
	public int insert(int item) 
	{
		int index = 0;
		while ( tree[index] != null )
		{
			if ( tree[index] > item ) // insert left
			{
				index = ( index * 2 ) + 1; // calculate the index to insert item on the left
			}
			else // insert right
			{
				index = ( index * 2 ) + 2; // calculate the index to insert item on the left
			}
		}
		tree[index] = item;
		
		return index;	
	}

	public int search(int item) 
	{
		int index = 0;
		Integer treeValue = tree[index];
		int current = integerToInt(treeValue);
		
		if ( current != 0 )
		{
			while ( current != item && index <= tree.length )
			{
				if ( current > item )
				{
					index = ( index * 2 ) + 1;
					current = notIndexOutofBound(index, current);
				}
				else
				{
					index = ( index *2 ) + 2;
					current = notIndexOutofBound(index, current);
				}
			}
			
			// check tree[index] with item
			if ( current == item )
			{
				return index;
			}
			else
			{
				return -1;
			}
		}
		else
		{
			throw new RuntimeException( "Tree is Empty." );
		}
	}

	public int notIndexOutofBound(int index, int current) {
		if ( index <= tree.length )
		{
			current = integerToInt(tree[index]);
		}
		return current;
	}

	public int integerToInt(Integer treeValue) {
		int current;
		if ( treeValue == null )
		{
			current = 0;
		}
		else
		{
			current = treeValue;
		}
		return current;
	}

}
