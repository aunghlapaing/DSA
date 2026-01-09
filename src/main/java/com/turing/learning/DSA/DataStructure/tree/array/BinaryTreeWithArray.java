package com.turing.learning.DSA.DataStructure.tree.array;

public class BinaryTreeWithArray {
	Integer[] tree = new Integer[20];	
	
	public int insert(int item) 
	{
		int index = 0;
		if ( tree[index] == null )
		{
			tree[index] = item;
		}
		else
		{
			while ( tree[index] != null )
			{
				if ( tree[index] > item ) // insert left
				{
					index = ( index * 2 ) + 1;
				}
				else
				{
					index = ( index * 2 ) + 2;
				}
			}
			tree[index] = item;
			
		}
		
		return index;	
	}

}
