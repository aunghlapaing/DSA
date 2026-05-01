package com.turing.learning.DSA.JavaHackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FrequentASCIIPipeLineTest {
	
	FrequentASCIIPipeLine solution = new FrequentASCIIPipeLine();
	
	@Test
	public void simpleCase() 
	{
		String wordsFromPipeLine = ( "aab" );
		
		char result = solution.frequentASCII( wordsFromPipeLine );
		
		assertEquals( 'a', result );
	}
	
	@Test
	public void duplicateFrequentWordNaturalOrderCase()
	{
		String wordsFromPipeLine = ( "aabb" );
		
		char result = solution.frequentASCII(wordsFromPipeLine);
		
		assertEquals( 'a', result );
	}
	
	@Test
	public void duplicateFrequentWordReverseOrderCase()
	{
		String wordsFromPipeLine = ( "bbaa" );
		
		char result = solution.frequentASCII(wordsFromPipeLine);
		
		assertEquals( 'b', result );
	}
	
	@Test
	public void longStringCase()
	{
		String wordsFromPipeLine = ( "aabbcc jkjkdgjeo jeoejf 000hfhfjjjjj///////////////" );
		
		char result = solution.frequentASCII(wordsFromPipeLine);
		
		assertEquals( '/', result );
	}

}
