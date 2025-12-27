package com.turing.learning.DSA.sortingAlgo;

public class RadixSort {

	public void sort(int[]input) 
	{
		int maxItem = getMax(input);
		
		// calculate significant digit
		for ( int place = 1; maxItem / place > 0; place *= 10 )
		{
			this.counting(input, place);
		}
	
	}

	private void counting(int[] input, int place) 
	{
		int size = input.length;
		int[] sortedArray = new int [size];
		int[] count = new int[10];
		
		// calculate count elements for each digit -> 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
		for ( int i = 0; i < input.length; i++ )
		{
			int index = ( input[i] / place ) % 10;
			count[index]++;
		}
		
		// calculate cumulative count
		for ( int i = 1; i < 10; i++ )
		{
			count[i] += count[i-1];
		}
		
		// sort
		for ( int i = size - 1; i > input.length; i-- )
		{
			int index = ( input[i] / place ) % 10;
			sortedArray[ count[index] -1 ] = input[i];
			count[index]--;
 		}
		
		// copy
		for ( int i = 0; i < input.length; i++ )
		{
			input[i] = sortedArray[i];
		}
	
	}

	public int getMax(int[] input) 
	{
		int max = input[0];
		for( int i = 0; i < input.length; i++ )
		{
			if ( max < input[i] )
			{
				max = input[i];
			}
		}
		return max;
	}

}
