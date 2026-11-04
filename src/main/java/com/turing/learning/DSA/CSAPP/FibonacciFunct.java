package com.turing.learning.DSA.CSAPP;

public class FibonacciFunct extends Fibonacci {

	@Override
	int funct(int n) {
		
		int result = 0;
		if( n == 0 ) // exist
		{
			return 0;
		}
		else if( n == 1)
		{
			return 1;
		}
		else
		{
			result = funct(n-2) + funct(n-1);
			
		}
		if(result < 0)
		{
			throw new ArithmeticException("Two Complement overflow.");
		}
		else
		{
			return result;
		}
	}

}
