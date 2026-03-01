package com.turing.learning.DSA.HackerRank.OOP;

public class GradingSystem extends Grade {
	
	int[] testScores;

	public GradingSystem(String name, int id, int[] score) 
	{
		// parameter passing using super keyword
		super( name, id );
		testScores = score;
	}

	
	
	public char calculate() 
	{
		// parent class method called with super keyword
		super.display();
		
		int score = 0;
		char result = ' ';
		if ( testScores.length < 1 )
		{
			result = gradingScale(score);
		}
		else
		{
			for ( int i : testScores )
			{
				score += i;
				
			}
			result = gradingScale( score/testScores.length );
		}
		
		return result;
	}

	public char gradingScale( int score )
	{
		if ( 80 <= score && score <= 100 )
		{
			return 'A';
		}
		else if ( 60 <= score && score <= 79 )
		{
			return 'B';
		}
		else if ( 40 <= score && score <= 59 )
		{
			return 'C';
		}
		else if ( score < 40 )
		{
			return 'D';
		}
		return ' ';
			
	}
}
