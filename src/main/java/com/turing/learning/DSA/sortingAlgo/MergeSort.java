package com.turing.learning.DSA.sortingAlgo;

import java.util.Arrays;

public class MergeSort {
	
	Util util = new Util();

	public void merge(int[] input, int left, int middle, int right) 
	{
		int i = left;
		int j = middle + 1;
		
		int k = 0;
		int len = right-left+1;
		int[] result = new int[len];
		while ( i <= middle & j <= right ) // i and j are equal
		{
			if ( input[i] == input[j] )
			{
				result[k++] = input[i++];
			}
			else if ( input[i] < input[j] )
			{
				result[k++] = input[i++];
			}
			else if ( input[i] > input[j] )
			{
				result[k++] = input[j++];
			}
		}
		while ( i <= middle )
		{
			result[k++] = input[i++];
		}
		while ( j <= right )
		{
			result[k++] = input[j++];
		}
		System.out.println("Result "+Arrays.toString(result));
		System.arraycopy(result, 0, input, left, len);

	}
	
	public void mergeSort( int[] input, int left, int middle, int right )
	{
		System.out.println("Input" + Arrays.toString(input)+"left"+left+"middle"+middle+"right"+right);
		if ( left != right )
		{
			int firstMiddle = (left + middle)/2;
			this.mergeSort(input, left, firstMiddle, middle);
			
			int secondMiddle = ( middle + 1 + right )/2;
			this.mergeSort(input, middle+1, secondMiddle, right);
			
			this.merge(input, left, middle, right);
		}
		else
		{
			return;
		}
		
	}

	public void sort(int[] arr) {
		
		int left = 0;
		int right = arr.length - 1;
		
		int middle = (left + right)/2;
		
		this.mergeSort(arr, left, middle, right);
		
	}

}
