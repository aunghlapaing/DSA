package com.turing.learning.DSA.DataStructure.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArraySumTest {
	
	@Test
	public void arraySumWithRecursive()
	{
		
		int[] arr = {3, 4};
		ArraySumRecursive array = new ArraySumRecursive(arr);
		
		int result = array.sum();
		assertEquals( 7, result );
		
	}

}
