package com.turing.learning.DSA.HackerRank;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DelimiterTest {

	@Test
	public void simpleInputCase()
	{
		Delimiter delimiter = new Delimiter();
		assertTrue( delimiter.delimited( "()" ) );  
	}
	
}
