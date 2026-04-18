package com.turing.learning.DSA.HackerRank;

import java.util.Scanner;

public class HourGlassWithArray {
	
	public static void hourGlassSum( int[][] input )
	{
		int result = 0;
		for ( int i = 0; i < input.length- 2; i++ )
		{
			for ( int j = 0; j < input.length - 2; j++  )
			{
				result = Math.max(result, (input[i][j] + input[i][j+1] + input[i][j+2] + 
						input[i+1][j+1] + input[i+2][j] + input[i+2][j+1] + input[i+2][j+2]));
			}
		}
		System.out.println( "Result :" + result );	
	}

	public static void main( String [] args )
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println( "Enter input size :" );
		int size = sc.nextInt();
		int[][] arr = new int[size][size];
		
		for( int i = 0; i < arr.length; i++ )
		{
			for ( int j = 0; j < arr.length; j++ )
			{
				System.out.println( "Enter number :" );
				int number = sc.nextInt();
				arr[i][j] = number ;
			}
		}
		hourGlassSum(arr);
		sc.close();
	}
}
