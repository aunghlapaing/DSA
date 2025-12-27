package com.turing.learning.DSA.sortingAlgo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CountingSortTest {
	
	CountingSort sortingAlgo = new CountingSort();
	Util util = new Util();
	
	@Test
	public void findMaxItemCase()
	{
		int[] arr = {3, 2, 1, 4, 5, 6};
		
	    int max = sortingAlgo.getMax(arr);
		assertEquals( 6, max );
	}
	
	@Test
	public void sortCase()
	{
		int[] arr = {3, 2, 1, 4, 5, 6};
		
		sortingAlgo.sort(arr);
		
		
		assertTrue(util.sortedArray(arr));
	}

}
