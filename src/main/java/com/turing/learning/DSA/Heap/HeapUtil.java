package com.turing.learning.DSA.Heap;

import java.util.List;

public class HeapUtil {

	Integer root;

	boolean heapUtil(List<Integer> list)
	{
		root = list.get(0);
		return isMax( list, root );
	}

	private boolean isMax(List<Integer> data, int currentIndex) 
	{
		boolean max = true;
		int leftIndex = ( currentIndex * 2 ) + 1;
		int rightIndex = ( currentIndex * 2 ) + 2;
		
		if ( leftIndex < data.size() )
		{
			if ( root < data.get(leftIndex) )
			{
				max = false;
			}
			isMax( data, leftIndex );
		}
		if ( rightIndex < data.size() )
		{
			if ( root < data.get(rightIndex) )
			{
				max = false;
			}
			isMax( data, rightIndex );
		}	
		
		return max;
		
	}
	

}
