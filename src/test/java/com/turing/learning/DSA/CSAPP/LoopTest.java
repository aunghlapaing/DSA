package com.turing.learning.DSA.CSAPP;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LoopTest {
	
	private Loop solution = new WhileLogicChp3();
	//private Loop solution = new ForLogicChp3();
	
	@Test
	public void simpleCase()
	{
		 int result = solution.sum(3);
		 
		 assertEquals(2, result);
		
	}
	
	@Test
	public void lenghtFiveCase()
	{
		int result = solution.sum(5);
		assertEquals(9, result);
		
	}

}
