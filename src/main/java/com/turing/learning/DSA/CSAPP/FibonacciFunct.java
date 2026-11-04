package com.turing.learning.DSA.CSAPP;

public class FibonacciFunct extends Fibonacci {

	@Override
	int funct(int n) {
		
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
			
			return funct(n-2) + funct(n-1);
//			try {
//				result = funct(n-2) + funct(n-1);
//			}catch(ArithmeticException e)
//			{
//				throw new RuntimeException("Two Complement Overflow.");
//			}
			
		}
		
	}

}
