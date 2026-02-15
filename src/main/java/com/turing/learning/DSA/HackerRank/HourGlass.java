package com.turing.learning.DSA.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class HourGlass {
	
	public int hourGlassSum(List<List<Integer>> list)
	{
		int result = Integer.MIN_VALUE;
		
		int n = 0;
		while ( n < list.size() - 2 )
		{
			int m = 0;
			while ( m < list.size() - 2 )
			{
				List<List<Integer>> sumArr = new ArrayList<>();
				for ( int i = n; i <= (n + 3) - 1; i++ )
				{
					List<Integer> innerArr = new ArrayList<>();
					List<Integer> arr = list.get(i);
					for ( int j = m; j <= (m + 3) - 1; j++ )
					{
						innerArr.add(arr.get(j));
					}
					sumArr.add(innerArr);
				}
				int sum = this.hourGlass( sumArr );
				if ( sum > result )
				{
					result = sum;
				}
				m++;
			}
			n++;
			
		}
		return result;
	}
	
	public int hourGlass(List<List<Integer>> list) 
	{
		int sum = 0;
		for ( int i = 0; i < list.size(); i++ )
		{
			List<Integer> arr = list.get(i);
			if( i == list.size()/2 )
			{
				int num = arr.get(i);
				sum += num ; 
			}
			else
			{
				for ( Integer num : arr )
				{
					sum += num;
				}
			}
			System.out.println( "SUM :" + sum );
		}
		return sum;
	}

}
