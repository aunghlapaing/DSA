package com.turing.learning.DSA.HackerRank;

import java.util.List;
import java.util.ArrayList;

public class ArraySum {

	public List<Integer> compareRating(List<Integer> a, List<Integer> b) 
	{
		List<Integer> result = new ArrayList<Integer>();
		
		int[] rating = new int[2];
		
		int n = a.size();
		int i = 0;
		while( i < n )
		{
			if ( a.get(i) > b.get(i) )
			{
				rating[0]++;
			}
			else if ( a.get(i) < b.get(i) )
			{
				rating[1]++;
			}
			i++;
		}
		result.add(rating[0]);
		result.add(rating[1]);
		
		return result;
	}

}
