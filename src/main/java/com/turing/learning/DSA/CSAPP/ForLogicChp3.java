package com.turing.learning.DSA.CSAPP;

public class ForLogicChp3 implements Loop {

	@Override
	public int sum(int n) {
		
		int result = 0;
		
		for( int i = 0; i < n; i++ )
		{
			if( isEqual(i))
			{
				continue;
			}
			result += i;
		}
		
		return result;
	}
	
	private boolean isEqual(int a)
	{	
		if( a == 1 )
		{
			return true;
		}
		return false;
	}

	
}
