package com.turing.learning.DSA.JavaHackerRank;

public class MinimumBinarySum {

	public int minimumSum(String string) {
		
		int result = 0;
		for( int i = 0; i < string.length(); i++ )
		{
			int num = Character.getNumericValue(string.charAt(i));
			if( result < num ) 
			{
				System.out.println( "Num 2 : " + num );
				result = num;
			}
			
		}
		
		return result;
	}
	
	
	

}
