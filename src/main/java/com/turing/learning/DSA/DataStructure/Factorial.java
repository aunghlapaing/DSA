package com.turing.learning.DSA.DataStructure;

public class Factorial {

	public int factorial(int n) {
		
		while ( n != 0 )
		{
			return n * factorial( n - 1 );
		}
		
		return 1;
	}

}
