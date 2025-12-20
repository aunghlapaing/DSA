package com.turing.learning.DSA.sortingAlgo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class BubbleSortTest {
	
	SortingAlgo bubbleSort = new BubbleSort();
	Util util = new Util();
	
	@Test
	public void simpleCase()
	{
		int[] arr = {};
		bubbleSort.sort(arr);
		assertTrue( util.sortedArray(arr));
	}
	
	@Test
	public void positiveCase()
	{
		int[] arr = {1, 2, 3, 4, 5};
		bubbleSort.sort(arr);
		assertTrue(util.sortedArray(arr));
	}
}
