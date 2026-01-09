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

}
