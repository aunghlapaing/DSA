package com.turing.learning.DSA.HackerRank;

public class NonRepeating {

	public int nonRepeatingCharacter(String string)
	{
		int n = string.length();
		if ( n < 1 )
		{
			return -1;
		}
		else
		{
			if( n == 1 )
			{
				return 0;
			}
			else
			{
				int i = 0;
				while( i < 1 )
				{
					char first = string.charAt(i);
					char second = string.charAt(i+1);
					if ( first == second )
					{
						return -1;
					}
					i++;
				}
			}
		}
		return 0;
	}

}
