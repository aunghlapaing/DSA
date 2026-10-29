package com.turing.learning.DSA.CSAPP;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IntegerRoundingTest {
	
	//IntegerRounding solution = new RoundDownWard();
	IntegerRounding solution = new RoundUp();
	
	@Test
	void testRoundDownWard()
	{
		
		int result = solution.rounding(10, 3); // 3.3333...
		assertEquals( 3, result );
	}
	
	@Test
	void testRoundUp()
	{
		int result = solution.rounding(-5, 3); // -1.6666...
		assertEquals(-1, result);
	}

}
