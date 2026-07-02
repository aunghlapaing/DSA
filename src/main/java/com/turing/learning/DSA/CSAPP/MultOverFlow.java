package com.turing.learning.DSA.CSAPP;

public class MultOverFlow {

	public boolean multOverFlowCheck(int x, int y) {	
		
		int p = x * y;
		
		System.out.println( "P :" + p );
		
		if ( p >= 4 || p < -4 )
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
