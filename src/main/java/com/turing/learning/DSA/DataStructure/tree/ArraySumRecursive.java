package com.turing.learning.DSA.DataStructure.tree;

public class ArraySumRecursive {
	
	int[] arr;
	
	ArraySumRecursive( int[] arr )
	{
		this.arr = arr;
	}

	public int sum() 
	{
		int i = arr.length - 1;
		int result = recursiveSum( arr, i );
		return result;
	}

	private int recursiveSum(int[] arr, int i) 
	{
		if ( i == 0 )
		{
			return arr[i];
		}
		else
		{
			return arr[i] + recursiveSum( arr, i-1 );
		}
		
	}

}
