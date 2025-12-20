package com.turing.learning.DSA.DataStructure;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class factorialTest {
	
	@Test
	public void baseCase()
	{
		Factorial factorial = new Factorial();
		
		int item = factorial.factorial(0);
		
		assertEquals( 1, item );
	}
	
	@Test
	public void recuriveCase()
	{
		Factorial factorial = new Factorial();
		
		int item = factorial.factorial(4);
		
		assertEquals( 24, item );
	}

}
