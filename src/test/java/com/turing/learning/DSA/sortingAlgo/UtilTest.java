package com.turing.learning.DSA.sortingAlgo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class UtilTest {
	
	Util util = new Util();
	
	@Test
	public void negativeCase()
	{
		int[] arr = { 3, 2, 1 };
		
		assertFalse( util.sortedArray(arr) );
	}
	
	@Test
	public void emptyCase()
	{
		int[] arr = {};
		assertTrue( util.sortedArray(arr) );
	}
	
	@Test
	public void positiveCase()
	{
		int[] arr = {1, 2, 3, 4, 5};
		assertTrue( util.sortedArray(arr) );
	}
	
	@Test
	public void NaNCase()
	{
		int[] arr = { -1, 2, 3 };
		assertTrue( util.sortedArray(arr) );
	}

}
