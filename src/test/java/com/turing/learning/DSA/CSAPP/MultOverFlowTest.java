package com.turing.learning.DSA.CSAPP;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MultOverFlowTest {
	
	MultOverFlow solution = new MultOverFlow();
	@Test
	public void BaseCase()
	{
		boolean result = solution.multOverFlowCheck(0, 1);
		assertEquals( true, result );
		
	}
	
	@Test
	public void PositiveEdgeCase()
	{	
		boolean result = solution.multOverFlowCheck(3, 1);
		assertEquals( true, result );
		
	}
	@Test
	public void NegativeEdgeCase()
	{	
		boolean result = solution.multOverFlowCheck(-2, 2);
		assertEquals( true, result );
		
	}
	
	@Test
	public void negativeEdgeOverFlowCase()
	{	
		boolean result = solution.multOverFlowCheck(-4, 4);
		assertEquals( false, result );
		
	}
	
	@Test
	public void PositiveOverFlowEdgeCase()
	{	
		boolean result = solution.multOverFlowCheck(3, 3);
		assertEquals( false, result );
		
	}

}
