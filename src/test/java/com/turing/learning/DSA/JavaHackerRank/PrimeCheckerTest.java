package com.turing.learning.DSA.JavaHackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;
import org.junit.jupiter.api.Test;

public class PrimeCheckerTest {
	
	// we gonna used different parameter into same method. And do not use method overloading.
	// variable-lenght arguments
	
	Prime p = new Prime();
	
	@Test
	public void baseCase()
	{
		int n1 = 2;
		
		List<Integer> primeList = p.checkPrime(n1);
		assertEquals( 2, primeList.get(0) );
	}
	
	@Test
	public void differentParemeterCase()
	{
		int n1 = 2;
		int n2 = 1;
		int n3 = 3;
		
		List<Integer> primeList1 = p.checkPrime(n1, n2);
		assertEquals( 2, primeList1.get(0) );
		
		List<Integer> primeList2 = p.checkPrime(n1, n2, n3);
		assertEquals( 2, primeList2.get(0) );
		assertEquals( 3, primeList2.get(1) );
		assertEquals( 2, primeList2.size() );
	}
	
	@Test
	public void notPrimeNumberCase()
	{
		int n1 = 4;
		int n2 = 6;
		int n3 = 8;
		
		List<Integer> primeList = p.checkPrime(n1, n2, n3);
		assertEquals( 0, primeList.size() );
	}

}
