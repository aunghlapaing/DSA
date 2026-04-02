package com.turing.learning.DSA.JavaHackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PrimeCheckerTest {
	
	// we gonna used different parameter into same method. And do not use method overloading.
	// variable-lenght arguments
	
	Prime p = new Prime();
	
	@Test
	public void baseCase()
	{
		
		
		int n1 = 2;
		
		int primeNumber = p.checkPrime(n1);
		
		assertEquals( 2, primeNumber );
	}
	
	@Test
	public void differentParemeterCase()
	{
		Prime
	}

}
