package com.turing.learning.DSA.testing;

import java.util.Arrays;

import com.turing.learning.DSA.sortingAlgo.Util;

public class SelectionSort {

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
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			
		}	
		return arr;
	}
	
	public static void main ( String[]args )
	{
		SelectionSort selectionSort = new SelectionSort();
		
		Util util = new Util();
		
		int[] arr = {2, 3, 1, 4, 6};
		
		int[] result = selectionSort.sort(arr);
		
		System.out.println(" Result: " + Arrays.toString(result));
	}
}
