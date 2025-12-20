package com.turing.learning.DSA.sortingAlgo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SelectionSortTest {
	
	SortingAlgo selectionSort = new SelectionSort();
	Util util = new Util();
	
	@Test
	public void emptyCase()
	{
		int[] arr = {};
		selectionSort.sort(arr);
		assertTrue(util.sortedArray(arr));
	}
	
	@Test
	public void positiveCase()
	{
		int[] arr = {1, 2, 3};
		selectionSort.sort(arr);
		assertTrue(util.sortedArray(arr));
	}
	
	@Test
	public void negativeCase()
	{
		int[] arr = {3, 2, 1};
		selectionSort.sort(arr);
		assertTrue(util.sortedArray(arr));
	}
	
	@Test
	public void testWithRamdonArray()
	{
		int[] arr = util.randomArray(10);
		selectionSort.sort(arr);
		assertTrue(util.sortedArray(arr));
	}

}
