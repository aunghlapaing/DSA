package com.turing.learning.DSA.JavaHackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinaryToDecimalTest {
	
	Convertor solution = new BinaryToDecimal(); // use strategic design pattern
	
	@Test
	public void baseCase()
	{
		String input = "101101"; // 45 in decimal
		
		String result = solution.convert( input );
		
		assertEquals( "45", result );
	}
	
	@Test
	public void BitCase()
	{
		String input = "10001010";
		String result = solution.convert(input);
		assertEquals( "138", result );
	}

}
