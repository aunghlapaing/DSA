package com.turing.learning.DSA.searchAlgo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class binarySearchWithRecursiveTest {
	
	BinarySearchWithRecursive binary = new BinarySearchWithRecursive();
	
	@Test 
	public void binarySearchNegativeCase()
	{
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int left = 0;
		
		int right = arr.length - 1;
		
		int item = binary.search(arr, 6, left, right );
		assertEquals( -1, item );
	}
	
	@Test 
	public void binarySearchPositiveCase()
	{
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int left = 0;
		
		int right = arr.length - 1;
		
		int item = binary.search(arr, 5, left, right );
		assertEquals( 4, item );
	}
	
	

}
