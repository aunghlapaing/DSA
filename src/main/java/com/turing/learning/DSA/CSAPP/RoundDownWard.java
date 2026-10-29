package com.turing.learning.DSA.CSAPP;

public class RoundDownWard implements IntegerRounding {

	@Override
	public int rounding(int a, int b) {
		
		int result = a / b;
		return result;
	}

}
