package com.turing.learning.DSA.searchAlgo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinearSearchTest {
	
	SearchingAlgo linearSearch = new LinearSearch();
	
	int [] arr = {2, 3, 4, 5, 1, 1};
	
	@Test
	public void simpleCase()
	{
		int index = linearSearch.search(arr, 1);
		
		assertEquals(4, index);
	}
	
	@Test
	public void negativeCase()
	{
		int index = linearSearch.search(arr, 0);
		
		assertEquals(-1, index);
	}
	
	@Test
	public void duplicateCase()
	{
		int index = linearSearch.search(arr, 1);
		
		assertEquals(4, index);
	}

}
