package com.turing.learning.DSA.sortingAlgo;

import java.util.Arrays;

public class BubbleSort implements SortingAlgo {

	@Override
	public int[] sort(int[] arr) {
		
		
		for ( int i = 0; i < arr.length - 1; i++)
		{
			for ( int j = i + 1; j < arr.length; j++ )
			{
				if ( arr[i] > arr[j] )
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args)
	{
		SortingAlgo bubbleSort = new BubbleSort();
		int[] arr = {4, 3, 5, 6, 1};
		bubbleSort.sort(arr);
		
		String result = Arrays.toString(arr);
		
		System.out.println("Sorted Array: "+ result);
	}


}
