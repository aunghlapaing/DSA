package com.turing.learning.DSA.JavaHackerRank;

public class StringSplitRegex {
	
	/*
	static {
		
		for( int i = 0; i < 20000; i++ )
		{
			splitToken("");
			
		}
		
	}
	*/
	
	static String[] splitToken(String input) {
		
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
	
	public static void main(String[] args) {
        long start = System.nanoTime();
        
        // 3. Measure the process now that native code is running
        splitToken("actual,production,tokens"); 
        
        long end = System.nanoTime();
        System.out.println("Execution time: " + (end - start) / 1_000_000.0 + " ms");
    }

}
