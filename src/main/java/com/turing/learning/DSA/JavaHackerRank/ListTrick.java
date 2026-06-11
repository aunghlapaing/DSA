package com.turing.learning.DSA.JavaHackerRank;

import java.util.*;

public class ListTrick {
	
	static List<Integer> list = new ArrayList<Integer>(); // making list as class variable
	
	static void exchangeInsert( int x, int y )
	{
		list.add(x, y);
	}
	
	static void delete( int x )
	{
		list.remove(x);
		
	}
	
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		
		System.out.println( "Enter size of list : " );
		int size = sc.nextInt();
		
		for( int i = 0; i < size; i++ )
		{
			list.add(sc.nextInt());
		}
		
		System.out.println( "Number of query : " );
		int query = sc.nextInt();
		
		for( int i = 0; i < query; i++ )
		{
			String instruction = sc.next();
			
			if ( "insert".equals(instruction) )
			{
				System.out.println( "Enter x : " );
				int x = sc.nextInt();
				
				System.out.println( "Enter y : " );
				int y = sc.nextInt();
				
				exchangeInsert(x, y);  
			}
			else if( "delete".equals(instruction) )
			{
				System.out.println( "Enter index to delete :" );
				int deleteIndex = sc.nextInt();
				
				delete( deleteIndex );
			}
		}
		
		for( int i = 0; i < list.size(); i++ )
		{
			System.out.print( list.get(i) + " " );
			
		}
		
		sc.close();
		
		
	}

}
