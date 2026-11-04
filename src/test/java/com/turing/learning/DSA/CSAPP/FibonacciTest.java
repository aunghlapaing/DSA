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
	void TwoFunctSumCase()
	{
		int result = solution.funct(2);
		
		assertEquals(1, result);
		
	}
	
	@Test
	void ThreeFunctSumCase()
	{
		int result = solution.funct(3);
		
		assertEquals(2, result);
		
	}
	
	//@Test
	void EdgeFunctSumCase()
	{

		RuntimeException except = assertThrows(RuntimeException.class, ()->{
			solution.funct(58);
		});
		
		assertEquals("Two Complement Overflow.", except.getMessage());
		
	}

}
