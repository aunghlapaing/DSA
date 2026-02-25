package com.turing.learning.DSA.HackerRank;

public class Looping {
	
	public void stairCase( int n )
	{
		int count = n;
		while ( n > 0 )
		{
			for ( int i = 0; i < n - 1; i++)
			{
				System.out.print(" ");
			}
			for ( int j = count - ( n - 1 ); j > 0; j-- )
			{
				System.out.print("#");
			}
			System.out.println();
			n--;
		}
	}
	
	public static void main( String[] args )
	{
		Looping loop = new Looping();
		loop.stairCase(4);
	}
}
