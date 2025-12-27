package com.turing.learning.DSA.sortingAlgo;

import java.util.Arrays;

public class CountingSort {

	public int getMax(int[] arr) 
	{
		int max = arr[0];
		
		for ( int i = 0; i < arr.length; i++ )
		{
			if (max < arr[i])
			{
				max = arr[i];
			}
		}
		return max;
	}

	public void sort(int[] arr) 
	{
		int size = arr.length;
		int maxElement = this.getMax(arr);
		
		int[] count = new int [maxElement + 1];
		int[] sortedArray = new int [size];
		
		/* calculate the count of the elements */
		for ( int i = 0; i < size; i++ )
		{
			count[arr[i]]++;
		}
		
		System.out.println("First Count Array :" + Arrays.toString(count));
		
		/* calculate cumulative count */
		for ( int i = 1; i <= maxElement; i++ )
		{
			count[i] += count[i - 1];
		}
		System.out.println("Second Count Array :" + Arrays.toString(count));
		
		/* sort */
		for ( int i = size - 1; i >= 0; i-- )
		{
			int index = arr[i];
			sortedArray[count[index] - 1] = arr[i];
			count[index]--;
		}
		System.out.println("Sorted Array :" + Arrays.toString(sortedArray));
		
		
		/* copy */
		for ( int i = 0; i < arr.length; i++ )
		{
			arr[i] = sortedArray[i];
		}
		
		System.out.println("Sorted Array :" + Arrays.toString(arr));
	}
	

}
