package com.turing.learning.DSA.HackerRank;

import java.util.Collections;
import java.util.*;

public class LeaderBoard {
	
	public static int binarySearch(List<Integer> list, int searchItem)
	{
		int index = 0;
		int left = 0;
		int right = list.size()-1;
		while(left <= right)
		{
			int mid = left + ( right - left ) / 2;
			if( searchItem == list.get(mid) )
			{
				return mid;
			}
			else if ( searchItem > list.get(mid) ) // go to left because reversed order
			{
				right = mid - 1;
				index = right;
			}
			else if( searchItem < list.get(mid) )
			{
				left = mid + 1;
				index = left;
			}
		}
		return index;
	}

	public List<Integer> scoreBoard(List<Integer> rank, List<Integer> playerMark) {
		
		List<Integer> result = new ArrayList<>();
		
		List<Integer> listRank = rank.stream()
								.distinct()
								.sorted( Collections.reverseOrder() )
								.toList();
		
		for( Integer i : playerMark )
		{
			int index = binarySearch( listRank, i );
			System.out.println( "Index : " + index );
			if( index < 0 )
			{
				index = (index + 1);
			}
			result.add(index+1);
		}
		
		return result;
	}

}
