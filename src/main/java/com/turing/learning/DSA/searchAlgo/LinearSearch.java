package com.turing.learning.DSA.searchAlgo;

public class LinearSearch implements SearchingAlgo {

	@Override
	public int search(int[] arr, int item) {
		for ( int i = 0; i < arr.length; i++ )
		{
			if ( item == arr[i] )
			{
				return i;
			}
		}
		return -1;
	}
	

}
