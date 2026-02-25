package com.turing.learning.DSA.DataStructure;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

public class DelimiterTest {
	Delimiter delimiter = new Delimiter();
	
	@Test
	public void EmptyCase()
	{
		assertTrue(delimiter.isValid(""));
	}
	
	@Test
	public void positiveCase()
	{
		assertTrue(delimiter.isValid("a[b]"));
	}
	
	@Test
	public void negativeCase()
	{
		assertFalse(delimiter.isValid("}{"));
	}
	
	// ({(){}()})()({(){}()})(){()}

}
