package com.turing.learning.DSA.CSAPP;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class FibonacciTest {
	
	Fibonacci solution = new FibonacciFunct();
	
	@Test
	void edge0Case()
	{
		int result = solution.funct(0);
		
		assertEquals(0, result);
		
	}
	
	@Test
	void edge1Case()
	{
		int result = solution.funct(1);
		
		assertEquals(1, result);
		
	}
	
	@Test
	void twoFunctSumCase()
	{
		int result = solution.funct(2);
		
		assertEquals(1, result);
		
	}
	
	@Test
	void threeFunctSumCase()
	{
		int result = solution.funct(3);
		
		assertEquals(2, result);
		
	}
	
	@Test
	void largeNumberFunctSumCase()
	{
		int result = solution.funct(13);
		
		assertEquals(233, result);
		
	}
	
	@Test
	void edgeFunctSumCase()
	{
		int result = solution.funct(46);
		
		assertEquals(1836311903, result);
		
	}
	
	//@Test
	void OverflowCaseFunctSumCase()
	{
		int result = solution.funct(47);
		
		assertEquals(-1323752223, result); // throw negative number because the result is out of the range of two complement number (int)
		
	}
	
	@Test
	void OverflowCase1FunctSumCase()
	{

		RuntimeException except = assertThrows(RuntimeException.class, ()->{
			solution.funct(47);
		});
		
		assertEquals("Two Complement overflow.", except.getMessage());
		
	}

}
