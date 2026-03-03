package com.turing.learning.DSA.HackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MinDifferenceTest {
	
	int[] arr = { 1, 2, 5 };
	
	@Test
	public void simpleInputCase()
	{
		Difference difference = new Difference(arr);
		
		difference.computeDifference();
		
		assertEquals( 4, difference.maxDifference );
				
	}

}
