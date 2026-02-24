package com.turing.learning.DSA.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ToCapital {
	
	/*
	 * AAA
	 * - ------------- -
	 * Arrange
	 * Act
	 * Assert
	 * */
	
	Capital cap = new Capital();
	
	@Test
	public void testEmpty()
	{
		String output = cap.toCapital(" ");
		
		System.out.println("Output : " + output);
		
		assertEquals("", output);
	}
	
	@Test
	public void testSingleCase()
	{
		String output = cap.toCapital("a");

		assertEquals("A", output);
	}
	
	@Test
	public void testMultipleCase()
	{
		String output = cap.toCapital("apple orange");
		
		assertEquals("Apple Orange", output);
	}
	

	

}
