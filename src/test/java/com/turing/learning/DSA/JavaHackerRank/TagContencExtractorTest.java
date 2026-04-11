package com.turing.learning.DSA.JavaHackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import org.junit.jupiter.api.Test;

public class TagContencExtractorTest {
	
	TagContentExtractor solution = new TagContentExtractor();
	
	@Test
	public void validSimpleCase()
	{	
		String input = "<h1>This is valid</h1>";
		
		List<String> result = solution.validCheck(input);
		
		assertEquals( "This is valid", result.get(0) );
	}
	
	@Test
	public void validInputWithNestedCase()
	{
		String input = "<h1><h2>This is valid</h2></h1><span>Second valid</span>";
		
		List<String> result = solution.validCheck(input);
		
		assertEquals( "This is valid", result.get(0) );
		assertEquals( "Second valid", result.get(1) );
	}
	
	@Test
	public void invalidCase()
	{
		String input = "<h1><h2>This is valid</h1><span>Second valid";
		
		List<String> result = solution.validCheck(input);
		
		assertEquals( 0, result.size() );
	}

}
