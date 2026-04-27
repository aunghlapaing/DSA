package com.turing.learning.DSA.Heap;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class HeapUtilTest {
	
	HeapUtil util = new HeapUtil();
	
	@Test
	public void isMaxNegativeCase()
	{
		Integer[] data = { 1, 4, 5, 2, 6, 10 };

		assertFalse( util.heapUtil(Arrays.asList(data)) );
	}
	
	@Test
	public void isMaxPositiveCase()
	{
		Integer[] data = { 10, 13, 5, 12, 2, 4, 1 };
		assertFalse( util.heapUtil(Arrays.asList(data)) );

	}
	
	@Test
	public void outOfBoundCase()
	{
		Integer[] data = {9};
		assertTrue( util.heapUtil(Arrays.asList(data)) );
	}
	

}
