package com.turing.learning.DSA.sortingAlgo;

import java.util.Arrays;

public class QuickSort {

	public int pivot(int[] input, int left, int right) 
	{
		
		System.out.println("Before Pivot array: " + Arrays.toString(input));
		int start = left;
		int end = right - 1;
		int last = right;
		
		int pivot = (left + right) / 2;
				
		// swap pivot and last
		int temp = input[pivot];
		input[pivot] = input[last];
		input[last] = temp;
				
		int pivotValue = input[last];
		
		System.out.println("After Swap Pivot array: " + Arrays.toString(input) + "Pivot Value" + pivotValue);
		
		while ( left < right )
		{	
			while ( input[left] < input[last] && left < right)
			{
				// traverse left
				left++;
			}
				
			System.out.println("When left stop: " + left);
			while( input[right] > input[last] && left < right)
			{
				// traverse right
				right--;
			}
			System.out.println("When right stop: " + right);
				
			// left and right stop
			// swap left and right
			if (left == right)
			{
				break;
			}
			else 
			{
				int temp1 = input[left];
				input[left] = input[right];
				input[right] = temp1;
				left++;
				right--;
			}		
		}
		// swap left and last
		int temp2 = input[last];
		input[last] = input[left];
		input[left] = temp2;
			
		System.out.println("After pivot array: "+ Arrays.toString(input));
		
		System.out.println("Left :" + left);
		return left;
		
	}
	
	public void quickSort(int[] input, int left, int right)
	{
		if ( left > right ) // single or invalid
		{
			return;
		}
		else
		{
			// get pivot index
			int pivotIndex = pivot(input, left, right);
			
			// split array from pivot and use recursive
			// first array [left -> pivot - 1]
			this.quickSort(input, left, pivotIndex - 1);

			// second array [pivot + 1 -> right]
			this.quickSort(input, pivotIndex + 1, right);
				
			System.out.println("After Sorted:" + Arrays.toString(input));
			
		}
	}
	
	public void sort( int[] input )
	{
		int left = 0;
		int right = input.length - 1 ;

		this.quickSort(input, left, right );
	}
		
	public static void main(String[] args)
	{
		QuickSort sortingAlgo = new QuickSort();
		
		int[] arr = {3, 4, 2, 1, 5};
		sortingAlgo.sort(arr);
		
	}
	

}
