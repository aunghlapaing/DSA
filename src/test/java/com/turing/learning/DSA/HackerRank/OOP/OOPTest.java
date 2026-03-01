package com.turing.learning.DSA.HackerRank.OOP;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class OOPTest {
	/*
	80 <= score <= 100 -> A
	60 <= score <= 79 -> B
	40 <= score <= 59 -> C
	score < 40 -> D
	*/
	
	@Test
	public void baseCase()
	{
		// name, id, [] score
		String name = "Aung";
		int id = 12345;
		int[] score = {30, 20, 50};
		
		GradingSystem gs = new GradingSystem(name, id, score);
		
		char result = gs.calculate();
		assertEquals( 'D', result);
		
	}

}
