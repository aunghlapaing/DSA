package com.turing.learning.DSA.HackerRank;

import java.util.Scanner;

public class EOF {
	
	public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print( "Enter line :" );
		String line = sc.nextLine();
		int i = 1;
		while ( sc.hasNext() && i < 10 )
		{
			System.out.println( i + " " + line );
			i++;
		}

		sc.close();
	}

}
