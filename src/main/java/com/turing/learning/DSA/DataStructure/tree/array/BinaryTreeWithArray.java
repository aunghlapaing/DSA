package com.turing.learning.DSA.DataStructure.tree.array;

import java.util.Arrays;

public class BinaryTreeWithArray {
	public Integer[] tree = new Integer[20];	
	
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

		while ( current != item && index <= tree.length - 1 )
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

	public int notIndexOutofBound(int index, int current) {
		if ( index <= tree.length - 1 )
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

	public Integer delete(int item) 
	{
		int deleteItemIndex = this.search(item);

		if ( deleteItemIndex == -1 )
		{
			return null;
		}
		else
		{
			Integer deleteItem = this.tree[deleteItemIndex];
			this.tree[deleteItemIndex] = null;
			
			// check root node?
			if (deleteItemIndex != 0)
			{
				// re-arrange binary tree property
				int parentIndex = ( (deleteItemIndex - 1) / 2 );
				
				// delete node has left child
				if ( this.tree[parentIndex] > deleteItem )
				{
					shiftLeftChildPosition(deleteItemIndex);
				}
				
				// delete node have right child
				else if ( this.tree[parentIndex] < deleteItem )
				{
					shiftRightChildPosition(deleteItemIndex);
				}
			}
			
			System.out.println( "TREE After DELETE :" + Arrays.toString(tree) );
			return deleteItem;		
		}
	
	}

	public void shiftRightChildPosition(int deleteItemIndex) {
		int rightIndex = ( deleteItemIndex * 2 ) + 2;
		if( this.tree[rightIndex] != null )
		{
			// change position
			int temp = deleteItemIndex;
			while ( this.tree[rightIndex] != null )
			{
				this.tree[temp] = this.tree[rightIndex];
				System.out.println( "Right Index and its value :" + temp + "," + this.tree[rightIndex]);
				
				temp = rightIndex;
				//System.out.println( "Temp Index :" + temp );
				rightIndex = ( rightIndex * 2 ) + 2;
			}
			this.tree[temp] = null;
			
		}
	}

	public void shiftLeftChildPosition(int deleteItemIndex) {
		int leftIndex = ( deleteItemIndex * 2 ) + 1;
		if( this.tree[leftIndex] != null )
		{
			// change position
			int temp = deleteItemIndex;
			while ( this.tree[leftIndex] != null )
			{
				this.tree[temp] = this.tree[leftIndex];
				System.out.println( "Left Index and its value :" + temp + "," + this.tree[leftIndex]);
				
				temp = leftIndex;
				//System.out.println( "Temp Index :" + temp );
				leftIndex = ( leftIndex * 2 ) + 1;
			}
			this.tree[temp] = null;
			
		}
	}
}
