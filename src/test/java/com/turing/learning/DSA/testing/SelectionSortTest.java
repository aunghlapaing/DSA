package com.turing.learning.DSA.testing;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import com.turing.learning.DSA.sortingAlgo.Util;

public class SelectionSortTest {
	
	@Test 
	public void simpleCase()
	{
		SelectionSort selectionSort = new SelectionSort();
		
		Util util = new Util();
		
		int[] arr = {2, 3, 1, 4, 6};
		
		selectionSort.sort(arr);
		
		assertTrue(util.sortedArray(arr));
		
		
	}

}
