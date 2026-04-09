package com.turing.learning.DSA.JavaHackerRank;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidRegexTest {
	
	ValidRegex solution = new ValidRegex();
	
	@Test 
	public void validRegexCase()
	{	
		String regex =  "[^a-zA-Z]";
		
		assertTrue( solution.checkValidRegex( regex ) );
	}
	
	@Test 
	public void validRegexEdgeCase()
	{	
		String regex =  "[       ]";
		
		assertTrue( solution.checkValidRegex( regex ) );
	}
	
	@Test
	public void inValidRegexCase()
	{
		String regex = "[AZ[a-z](a-z)";
		
		assertFalse( solution.checkValidRegex(regex) );
	}
	
	@Test
	public void inValidRegexEdgeCase()
	{
		String regex = "w7U7e-JtFhXwjJdVR%\"8P^`+RK0t6Z4P UobJ{j6C*((_Ixty6DwkJF)yPnIZ2PenF3r";
		
		assertFalse( solution.checkValidRegex(regex) );
	}
	

}
