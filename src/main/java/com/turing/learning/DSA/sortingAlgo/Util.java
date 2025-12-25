package com.turing.learning.DSA.sortingAlgo;

import java.util.Random;

public class Util {
	
	public boolean sortedArray(int[] arr)
	{
		for ( int i = 0; i < arr.length - 1; i++ )
		{
			if ( arr[i] > arr[i+1])
			{
				return false;
			}
		}
		return true;
	}

	public int[] randomArray(int size)
	{
		Random random = new Random();
		int[] arr = new int[size];
		
		for ( int i = 0; i < arr.length; i++ )
		{
			arr[i] = random.nextInt(10);
		}
		return arr;
	}
}
