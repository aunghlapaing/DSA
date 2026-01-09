package com.turing.learning.DSA.DataStructure.tree.array;

public class BinaryTreeWithArray {
	Integer[] tree = new Integer[20];	
	
	public Integer insert(int item) 
	{
		int index = 0;
		Integer current = tree[index];
		if ( current == null )
		{
			tree[index] = item;
		}
		
		return tree[index];
		
	}

}
