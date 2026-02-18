package com.turing.learning.DSA.HackerRank;

public class StairCase {

	public void makeStair(int size) 
	{
		for ( int i = size - 1; i > 0; i-- )
		{
			for ( int j = size; j > i ; j-- )
			{
				System.out.print("#");  
			}
			System.out.println();
		}
		
	}

	public static void main( String[] args ) 
	{
		StairCase stair = new StairCase();
		stair.makeStair(6);
	}
	
}
