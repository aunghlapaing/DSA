package com.turing.learning.DSA.JavaHackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinaryToDecimalTest {
	
	@Test
	public void baseCase()
	{
		Convertor solution = new BinaryToDecimal(); // use strategic design pattern
		
		String input = "101101"; // 45 in decimal
		
		String result = solution.convert( input );
		
		assertEquals( "45", result );
	}

}
