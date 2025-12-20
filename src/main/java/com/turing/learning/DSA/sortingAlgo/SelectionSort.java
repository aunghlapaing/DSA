package com.turing.learning.DSA.sortingAlgo;

public class SelectionSort implements SortingAlgo {

	@Override
	public int[] sort(int[] arr) {
		
		for ( int i = 0; i < arr.length - 1; i++ )
		{
			int minIndex = i;
			for ( int j = i + 1; j < arr.length; j++ )
			{
				
				if ( arr[minIndex] > arr[j] )
				{
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		
		return null;
	}

}
