package com.turing.learning.DSA.JavaHackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MinimumBinarySumTest {
	
	MinimumBinarySum mbs = new MinimumBinarySum();
	
	@Test 
	public void simpleCase()
	{
		int result = mbs.minimumSum( "32" );
		
		assertEquals( 3, result );
		
	}
	
	@Test
	public void longString()
	{
		int result = mbs.minimumSum("2958581985");
		
		assertEquals( 9, result );
		
	}

}
