package com.turing.learning.DSA.JavaHackerRank;

public class StringSplitRegex {

	public String[] splitToken(String input) {
		
		String cleaned = input.trim();
		
		if ( cleaned.length() < 1 ) return new String[cleaned.length()];
		
		String[] result = cleaned.split("[^a-zA-Z0-9]+");
		
		System.out.println( result.length );
		for( String i : result )
		{
			System.out.println( i );
		}
		
		return result;
	}

}
