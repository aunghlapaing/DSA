package com.turing.learning.DSA.JavaHackerRank;

import java.util.*;

public class SubArray {

	public List<List<Integer>> subArray(int[] arr) {
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		int count = 1;
		while( count <= arr.length )
		{
			int k = count;
			for( int i = 0; i < arr.length; i++ )
			{
				List<Integer> list = new ArrayList<Integer>();
				for( int j = i; j < k ; j++ )
				{
					list.add(arr[j]);
				}
				result.add(list);
				System.out.println( "K :" + k );
				k++;
			}
			System.out.println( "Count : " + count );
			count++;
			
		}
		System.out.println( result.size() );
		
		return result;
	}
	
	

}
