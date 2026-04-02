package com.turing.learning.DSA.JavaHackerRank;

import java.util.*;

public class Prime {

	// variable-lenght arguments
	public List<Integer> checkPrime(int... number) 
	{
		List<Integer> primeList = new ArrayList<Integer>();
		for( int n : number )
		{
			if(isPrime(n))
			{
				System.out.println( "Number :" + n );
				primeList.add(n);
			}
		}
		
		return primeList;
	}
	
	public boolean isPrime( int n )
	{
		// -n, 0 and 1 are not a prime number
		if( n < 2 ) return false; 
		for( int i = 2; i <= Math.sqrt(n); i++ )
		{
			// if n can be divisible by another number between 2 and its sqrt, it is not a prime
			if( n % i == 0 ) 
			{
				return false;
			}
		}
		return true;
	}

}
