package com.turing.learning.DSA.Heap;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class HeapUtilTest {
	
	@Test
	public void isMaxNegativeCase()
	{
		HeapUtil util = new HeapUtil();
		Integer[] data = { 1, 4, 5, 2, 6, 10 };

		assertFalse( util.heapUtil(Arrays.asList(data)) );
	}
	
	@Test
	public void isMaxPositiveCase()
	{
		HeapUtil util = new HeapUtil();
		Integer[] data = { 10, 6, 5, 11, 2, 4, 1 };
		assertTrue( util.heapUtil(Arrays.asList(data)) );

	}

}
