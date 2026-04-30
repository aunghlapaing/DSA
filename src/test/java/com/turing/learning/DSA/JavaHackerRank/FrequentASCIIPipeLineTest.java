package com.turing.learning.DSA.JavaHackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FrequentASCIIPipeLineTest {
	
	@Test
	public void simpleCase() 
	{
		FrequentASCIIPipeLine solution = new FrequenetASCIIPipeLine();
		
		String wordsFromPipeLine = ( "aab" );
		
		char result = solution.frequentASCII( wordsFromPipeLine );
		
		assertEquals( 'a', result );
	}

}
