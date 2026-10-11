package com.turing.learning.DSA.CSAPP;

public class WhileLogicChp3 implements Loop {

	public int sum(int n) {
		
		int result = 0;
		int i = 0; 
		while( i < n )
		{
			if( i == 1 )
			{
				i++;
				continue;
			}
			result += i;
			i++;
		}
		return result;
		
	}

}
