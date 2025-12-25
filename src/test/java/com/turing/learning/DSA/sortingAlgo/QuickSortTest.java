package com.turing.learning.DSA.sortingAlgo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class QuickSortTest {
	
	QuickSort sortingAlgo = new QuickSort();
	
	Util util = new Util();
	
	@Test
	public void pivotSimpleCase()
	{
		int[] arr = {5, 4, 3, 2, 1}; 

		int start = 0;
		int last = arr.length - 1;
		
		int pivot = sortingAlgo.pivot(arr, start, last);
		
		for ( int i = 0; i < pivot; i++ )
		{
			assertTrue( arr[i] < arr[pivot] );
		}
		
		for ( int j = pivot+1; j < last; j++ )
		{
			assertTrue( arr[j] > arr[pivot] );
		}
	}
		
	@Test
	public void pivotOutOfBoundCase()
	{
		//int[] arr = {5, 4, 0, 2, 3, 1}; 
		int[] arr = {0, 4, 5, 2, 3, 1}; 

		int start = 0;
		int last = arr.length - 1;
		
		int pivot = sortingAlgo.pivot(arr, start, last);
		
		for ( int i = 0; i < pivot; i++ )
		{
			assertTrue( arr[i] <= arr[pivot] );
		}
		
		for ( int j = pivot+1; j < last; j++ )
		{
			assertTrue( arr[j] > arr[pivot]);
		}
	
	}
	
	@Test
	public void randomDataPivotCase() 
	{
		int[] arr = util.randomArray(5);
		int start = 0;
		int last = arr.length - 1;
		
		int pivot = sortingAlgo.pivot(arr, start, last);
		
		for ( int i = start; i < pivot; i++ )
		{
			if ( isFirst(pivot) )
			{
				assertEquals( start, pivot );
			}
			assertTrue( arr[i] <= arr[pivot] );
		}
		
		for ( int j = pivot+1; j < last; j++ )
		{
			if ( isLast(last, pivot) )
			{
				assertEquals( last, pivot );
			}
			assertTrue( arr[j] >= arr[pivot]);
		}
	}

	private boolean isLast(int last, int pivot) {
		return pivot == last;
	}

	private boolean isFirst(int pivot) {
		return pivot == 0;
	}
	
	@Test
	public void sortSimpleCase()
	{
		int[] arr = {3, 4, 2, 1, 5};
		sortingAlgo.sort(arr);
		
		assertTrue( util.sortedArray(arr) );
		
	}
	
	@Test
	public void randomDataCase()
	{
		int[] arr = util.randomArray(13);
		sortingAlgo.sort(arr);
		
		assertTrue( util.sortedArray(arr) );
		
	}

}
