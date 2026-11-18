package com.turing.learning.DSA.CSAPP;

public class FixedNestedArray {
	
	public int[][] forInput(int[][] arr, int val)
	{
		for(int i = 0; i < arr.length; i++)
		{
			arr[i][i] = val;
		}
		
		return arr;
	}
	
	public int[][] optInput(int[][] arr, int val)
	{
		int size = arr.length;
		int start = 0;
		int end = size;
		do {
			arr[start][start] = val; 
			/* We can't opt because there is not pointer calculation in java just like C. 
			Even if we use do while and pointer reference,
			it is still using integer declaring and array referencing.
			So, there is no opt and according to result,
			using for logic would be better option here.
			*/
			start++;
		}while(start != end);

		return arr;
	}

}
