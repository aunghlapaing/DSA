package com.turing.learning.DSA.sortingAlgo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class InsertionSortTest {
	
	SortingAlgo insertionSort = new InsertionSort();
	Util util = new Util();
	
	@Test
	public void emptyCase()
	{
		int[] arr = {};
		insertionSort.sort(arr);
		assertTrue(util.sortedArray(arr));
	}
	
	@Test
	public void postiveCase()
	{
		int[] arr = {1, 2, 3};
		insertionSort.sort(arr);
		assertTrue(util.sortedArray(arr));
	}
	
	@Test
	public void negativeCase()
	{
		int[] arr = {3, 2, 1, 4, 6};
		//{1, 2, 3, 4, 6}
		
		insertionSort.sort(arr);
		assertTrue(util.sortedArray(arr));
	}
	
	@Test
	public void testWithRandomArray()
	{
		int[] arr = util.randomArray(10);
		insertionSort.sort(arr);
		assertTrue(util.sortedArray(arr));
	}
}
