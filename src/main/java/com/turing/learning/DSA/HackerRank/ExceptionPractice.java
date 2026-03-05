package com.turing.learning.DSA.HackerRank;

public class ExceptionPractice {
	
	public static void convertStringToInt( String input )
	{
		try
		{
			int convertedInt = Integer.parseInt(input);
			System.out.println(convertedInt);
		}
		catch ( Exception e )
		{
			System.out.println("Bad String");
		}
	}
	
	public static void main( String[] args )
	{
		convertStringToInt( "10" );
		convertStringToInt( "a" );
	}

}
