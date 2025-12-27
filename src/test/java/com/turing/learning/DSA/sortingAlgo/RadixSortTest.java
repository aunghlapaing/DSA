package com.turing.learning.DSA.sortingAlgo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RadixSortTest {
	
	RadixSort sortingAlgo = new RadixSort();
	
	Util util = new Util();
	
	@Test
	public void findMaxNumberCase()
	{
		int[] arr = {5, 1, 2, 23, 78, 561};
		
		int maxItem = sortingAlgo.getMax(arr);
		
		assertEquals(561, maxItem);
		
	}
	
	@Test
	public void simpleSortCase()
	{
		int[] arr = {5, 1, 2, 23, 78, 561};
		
		sortingAlgo.sort(arr);
		
		assertTrue( util.sortedArray(arr) );
	}
	
	@Test 
	public void randomDataSortCase()
	{
		int[] random = util.randomArray(13);
		sortingAlgo.sort(random);
		
		assertTrue( util.sortedArray(random) );
		
	}
	

}
