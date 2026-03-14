package com.turing.learning.DSA.HackerRank;

import java.util.Scanner;

public class PrimeChecker {
	
	public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numer of quantiy:");
		int n = sc.nextInt();
		
		for( int i = 0; i < n; i++ )
		{
			System.out.println( "Enter number to check prime:" );
			int num = sc.nextInt();
			int squareRootofNum = (int) Math.sqrt(num);
			int prime = 0;
			if( num == 1 )
			{
				prime = 1;
			}
			else
			{
				for( int j = 2; j <= squareRootofNum; j++ )
				{
					if( num % j == 0 )
					{
						prime = 1;
						break;
					}
				}
			}
			
			
			if( prime == 1 )
			{
				System.out.println( "Not prime" );
			}
			else
			{
				System.out.println( "Prime" );
			}
		}

		sc.close();
		
	}

}
