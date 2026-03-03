package com.turing.learning.DSA.HackerRank;

public class Difference {
	
	private int[] elements;
	public int maxDifference;
	
	Difference( int[] elements )
	{
		this.elements = elements;
	}

	public void computeDifference() 
	{
		int largest = elements[0];
		int smallest = elements[0];
		for ( int item : elements )
		{
			if ( item > largest )
			{
				largest = item;
			}
			else if ( item < smallest )
			{
				smallest = item;
			}
		}
		
		maxDifference = Math.abs(smallest - largest);
		
	}
	
	

}
