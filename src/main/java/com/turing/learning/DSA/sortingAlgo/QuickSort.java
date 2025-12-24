package com.turing.learning.DSA.sortingAlgo;

import java.util.Arrays;

public class QuickSort {

	public int pivot(int[] arr) 
	{
		int left = 0;
		int right = arr.length - 2;
		int last = arr.length - 1;
		int tempPivotIndex = (left + last) / 2  ;
		
		
		//System.out.println("Before swap Array:" + Arrays.toString(arr) );
		
		// swap tempPivotIndex and last
		int temp = arr[tempPivotIndex];
		arr[tempPivotIndex] = arr[last];
		arr[last] = temp;
		
		//System.out.println("After swap Array:" + Arrays.toString(arr) );
		
		//System.out.println("Check Pivot value index:" + arr[last] );
		
		while ( left < right )
		{	
			while ( arr[left] <= arr[last] && left < right)
			{
				// traverse left
				left++;
			}
				
			System.out.println("When left stop: " + Arrays.toString(arr));
			while( arr[right] >= arr[last] && left < right)
			{
				// traverse right
				right--;
			}
			System.out.println("When right stop: " + Arrays.toString(arr));
				
			// left and right stop
			// swap left and right
			if (left == right)
			{
				break;
			}
			else 
			{
				int temp1 = arr[left];
				arr[left] = arr[right];
				arr[right] = temp1;
				left++;
				right--;
			}
					
		}
		// swap left and last
		int temp2 = arr[last];
		arr[last] = arr[left];
		arr[left] = temp2;
			
		System.out.println("After pivot array: "+ Arrays.toString(arr));
		return left;
	}
		
	public static void main(String[] args)
	{
		QuickSort sortingAlgo = new QuickSort();
		
		int[] arr = {3, 4, 2, 1, 5};
		sortingAlgo.pivot(arr);
		
	}
	

}
