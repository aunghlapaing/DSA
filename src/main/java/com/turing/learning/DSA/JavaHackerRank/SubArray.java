package com.turing.learning.DSA.JavaHackerRank;

import java.util.*;

public class SubArray {

	public List<List<Integer>> subArray(int[] arr) {
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		for( int i = 0; i < arr.length; i++ ) // split count
		{
			for( int j = 0; j < arr.length - i; j++) // loop to create sub-array
			{
				List<Integer> list = new ArrayList<Integer>();
				for( int k = j; k < j + i + 1; k++ ) // create sub array
				{
					System.out.println( "third loop : " + arr[k] );
					list.add(arr[k]);
				}	
				result.add(list);
			}
		}
		
		System.out.println( "Size of result : " + result.size() );
		
		return result;
	}

	public int negativeSumSubArray(int[] arr) {
		
		List<List<Integer>> allSubArr = subArray(arr);
		
		int result = 0;
		for( List<Integer> list : allSubArr )
		{
			int sumSubArr = 0;
			for( int i = 0; i < list.size(); i++ )
			{
				sumSubArr += list.get(i);
			}
			if( sumSubArr < 0 )
			{
				result++;
			}
		}
		
		return result;
	}
	
	

}
