package com.turing.learning.DSA.searchAlgo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BinarySearchTest {
	SearchingAlgo binarySearch = new BinarySearch();
	
	int[] arr = {1, 2, 3, 4, 5};
	
	@ParameterizedTest
	@CsvSource({
				"3, 2",
				"8, -1",
				"5, 4"
	})
	public void binarySearchWithParameterizedTest( int item, int expected) {
		int index = binarySearch.search(arr, item);
		assertEquals(expected, index);
		
	}
	
	/*
	@Test
	public void SimpleCase()
	{
		int index = binarySearch.search(arr, 2);
		
		assertEquals(2, index);
	}
	
	@Test
	public void negativeCase()
	{
		int index = binarySearch.search(arr, 8);
		
		assertEquals( -1, index );
	}
	*/

}
