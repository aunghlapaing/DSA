package com.turing.learning.DSA.JavaHackerRank;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidRegexTest {
	
	@Test 
	public void validRegexCase()
	{
		ValidRegex solution = new ValidRegex();
		
		String regex =  "[^a-zA-Z]";
		
		assertTrue( solution.checkValidRegex( regex ) );
	}
	
	@Test

}
