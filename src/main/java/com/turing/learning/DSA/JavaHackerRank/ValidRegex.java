package com.turing.learning.DSA.JavaHackerRank;

import java.util.regex.Pattern;

public class ValidRegex {

	public boolean checkValidRegex(String regex) 
	{

		try {
			Pattern p = Pattern.compile(regex);
			System.out.println( "Valid" );
			return true;
		}
		catch( Exception e )
		{
			System.out.println("Invalid");
			return false;
		}
	}
}
