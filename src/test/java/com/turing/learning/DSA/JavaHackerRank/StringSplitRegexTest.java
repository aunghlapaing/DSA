package com.turing.learning.DSA.JavaHackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringSplitRegexTest {

	//StringSplitRegex solution = new StringSplitRegex();
	
	//@Test
	public void onlySpaceCase()
	{
		String input = "AI is good tool";
		
		String[] result = StringSplitRegex.splitToken(input);
		
		assertEquals( 4, result.length );
		assertEquals( "AI", result[0] );
		assertEquals( "is", result[1] );
		assertEquals( "good", result[2] );
		assertEquals( "tool", result[3] );
	}
	
	//@Test
	public void withSpecialCharacterCase()
	{
		String input = "AI is good tool, isn't it?";
		
		String[] result = StringSplitRegex.splitToken(input);
		
		assertEquals( 7, result.length );
		assertEquals( "AI", result[0] );
		assertEquals( "is", result[1] );
		assertEquals( "good", result[2] );
		assertEquals( "tool", result[3] );
		assertEquals( "isn", result[4] );
		assertEquals( "t", result[5] );
		assertEquals( "it", result[6] );
	}
	
	@Test
	public void withDuplicateSpecialCharacterCase()
	{
		String input = "    AI is good ,,,,,   tool";
		
		String[] result = StringSplitRegex.splitToken(input);
		
		assertEquals( 4, result.length );
	}

}
