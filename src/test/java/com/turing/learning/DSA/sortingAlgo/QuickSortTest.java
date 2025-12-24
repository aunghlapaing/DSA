package com.turing.learning.DSA.sortingAlgo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class QuickSortTest {
	
	@Test
	public void pivotCase()
	{
		QuickSort sortingAlgo = new QuickSort();
		
		int[] arr = {5, 4, 3, 2, 1};
		
		//3, 4, 2, 1, 5
		
		//3, 4, 1, 5, 2
		
		// 5, 4, 3, 2, 1
		
		int last = arr.length - 1;
		
		int pivot = sortingAlgo.pivot(arr);
		
		for ( int i = 0; i < pivot; i++ )
		{
			assertTrue( arr[i] < arr[pivot] );
		}
		
		for ( int j = pivot+1; j < last; j++ )
		{
			assertTrue( arr[j] > arr[pivot]);
		}
		
	}

}
