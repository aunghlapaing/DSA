package com.turing.learning.DSA.sortingAlgo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class QuickSortV2Test {
	
	QuickSortV2 sortingAlgo = new QuickSortV2();
	
	Util util = new Util();
	
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
