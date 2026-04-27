package com.turing.learning.DSA.Heap;

import java.util.List;

public class HeapUtil {

	Integer root;

	boolean heapUtil(List<Integer> list)
	{
		root = list.get(0);
		return isMax( list, 0 );
	}

	private boolean isMax(List<Integer> data, int currentIndex) 
	{
		int n = data.size();
		int leftIndex = ( currentIndex * 2 ) + 1;
		int rightIndex = ( currentIndex * 2 ) + 2;
		
		if ( leftIndex < n && root < data.get(leftIndex) )
		{
			if ( root < data.get(leftIndex) )
			{
				//System.out.println( "Left index Value : " + data.get(leftIndex) );
				return false;
			}
			isMax( data, leftIndex );
		}
		
		if ( rightIndex < n && root < data.get(rightIndex) )
		{	
			if ( root < data.get(rightIndex) )
			{
				return false;
			}
			isMax( data, rightIndex );
		}
		return true;
	}
}
