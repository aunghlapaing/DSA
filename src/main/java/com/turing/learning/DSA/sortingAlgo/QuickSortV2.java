package com.turing.learning.DSA.sortingAlgo;

import java.util.Arrays;

public class QuickSortV2 {

	public int[] pivot(int[] arr, int start, int last) 
	{
		int lt = start;
		int current = start;
		int gt = last;
		
		int pivot = arr[start];
		while ( current <= gt )
		{
			if ( arr[current] < pivot ) // less than pivot
			{
				// swap with current and lt
				// current++ , lt++
				int temp = arr[current];
				arr[current] = arr[lt];
				arr[lt] = temp;
				
				current++;
				lt++;
			}
			else if( arr[current] > pivot ) // greater than pivot
			{
				// swap with current and gt
				// gt--;
				
				int temp1 = arr[current];
				arr[current] = arr[gt];
				arr[gt] = temp1;
				
				gt--;
			}
			else
			{
				// current++;
				current++;
			}
		}
		System.out.println("After Pivot:" + Arrays.toString(arr));
		// return
		return new int[] {lt, gt}; 
	}
	
	private void quickSort(int[] arr, int start, int end) 
	{
		
		if (start > end) 
		{
			return;
		}
		
		int[] pivotArray = this.pivot(arr, start, end);
			
		// first array
		this.quickSort(arr, start, pivotArray[0] - 1);
			
		//second array 
		this.quickSort(arr, pivotArray[1] + 1, end);
		
	}

	public void sort(int[] arr) 
	{
		int start = 0;
		int end = arr.length - 1;
		
		this.quickSort(arr, start, end);
		
	}
}
