package com.turing.learning.DSA.CSAPP;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SwitchTest {
	
	private SwitchWithAssemble solution = new SwitchWithAssemble();
	
	@Test
	public void sumCase()
	{
		int result = solution.BasicMathWithSwitch(1, 2, 1);
		
		assertEquals( 3, result );
		
	}
	
	@Test
	public void subCase()
	{
		int result = solution.BasicMathWithSwitch(1, 2, 2);
		
		assertEquals( -1, result );
		
	}
	
	@Test
	public void negativeCase()
	{
		int result = solution.BasicMathWithSwitch(1, 2, 5);
		
		assertEquals( -1, result );
		
	}

}
