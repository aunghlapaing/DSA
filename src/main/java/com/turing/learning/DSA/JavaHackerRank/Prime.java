package com.turing.learning.DSA.JavaHackerRank;

public class Prime {

	// variable-lenght arguments
	public int checkPrime(int... number) 
	{
		for( int n : number )
		{
			if(isPrime(n))
			{
				return n;
			}
		}
		
		return -1;
	}
	
	public boolean isPrime( int n )
	{
		// -n, 0 and 1 are not a prime number
		if( n < 2 ) return false; 
		for( int i = 2; i <= Math.sqrt(i); i++ )
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
