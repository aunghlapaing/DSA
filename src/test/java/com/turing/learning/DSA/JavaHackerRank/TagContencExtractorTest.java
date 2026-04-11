package com.turing.learning.DSA.JavaHackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TagContencExtractorTest {
	
	@Test
	public void validSimpleCase()
	{
		TagContentExtractor solution = new TagContentExtractor();
		
		String input = "<h1>This is valid</h1>";
		
		String result = solution.validCheck(input);
		
		assertEquals( "This is valid", result );
	}

}
