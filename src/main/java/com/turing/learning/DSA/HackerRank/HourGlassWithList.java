package com.turing.learning.DSA.HackerRank;

import java.util.List;

public class HourGlassWithList {
	
	public int hourGlassSum( List<List<Integer>> input )
	{
		int result = Integer.MIN_VALUE;
		for ( int i = 0; i < input.size() - 2; i++ )
		{
			List<Integer> list0 = input.get(i);
			List<Integer> list1 = input.get(i+1);
			List<Integer> list2 = input.get(i+2);
			
			for ( int j = 0; j < input.size() - 2; j++ )
			{
				int sum = list0.get(j) + list0.get(j+1) + list0.get(j+2) + list1.get(j+1) + 
						list2.get(j) + list2.get(j+1) + list2.get(j+2);
				if ( sum > result )
				{
					result = sum;
				}
			}
		}
		
		return result;	
	}

}
