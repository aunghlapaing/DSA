package com.turing.learning.DSA.JavaHackerRank;

public class TagContencExtractorTest {
	
	@Test
	public void validSimpleCase()
	{
		TagContentExtractor solution = new TagContentExtractor();
		
		String input = ("<h>This is valid</h>");
		
		String result = solution.validCheck();
		
		assertEquals( "This is vali", result );
	}

}
