package com.turing.learning.DSA.JavaHackerRank;

import java.util.*;
import java.util.regex.*;

public class RegexName {
	
	static void validCheck( String input )
	{
		
		// start with letters not case sensitive
		// length greater than 8 and less than 30;
		// can contain \w not special characters
	
		Pattern p = Pattern.compile("^[a-zA-Z]\\w{7,29}");
		Matcher matcher = p.matcher(input);
		
		if( matcher.matches() )
		{
			System.out.println( "Valid" );
		}
		else
		{
			System.out.println( "Invalid" );
		}
	}
	
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		
		System.out.println( "Enter a quantity : " );
		byte n = sc.nextByte();
		sc.nextLine();
		
		// scanner input without nextLine() for testing
		
		while ( n-- > 0 )
		{
			String input = sc.nextLine();
			validCheck( input );
		}
		
		sc.close();
		
	}

}
