package com.turing.learning.DSA.CSAPP;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FixedNestedArrayTest {
	
	@Test
	void twoIndex()
	{
		FixedNestedArray solution = new FixedNestedArray();
		
		int arr[][] = new int[2][2];
		int val = 1;
		
		System.out.println( "Size of nested Array:" + arr.length );
		
		//int result[][] = solution.forInput(arr, val);
		int result[][] = solution.optInput(arr, val);
		
		assertEquals( 1, result[0][0] );
		assertEquals( 1, result[1][1] );
	}

}
