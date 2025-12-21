package com.turing.learning.DSA.sortingAlgo;



import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.Test;


public class MergeSortTest {

	MergeSort sorting = new MergeSort();
	
	Util util = new Util();
	
	@Test
	public void testMergeCase()
	{
		int[] input = {1, 2, 3};
		
		int left = 0;
		int right = input.length - 1;
		int middle = (left + right)/2;
		
		sorting.merge(input, left, middle, right);
		
		System.out.println("Sorted Array: " + Arrays.toString(input));
		
		assertTrue(util.sortedArray(input));
		
	}
	
	@Test
	public void mergeSortCase()
	{
		int[] arr = {3, 2, 1};
		
		sorting.sort(arr);
		System.out.println("Sorted Array: " + Arrays.toString(arr));
		assertTrue(util.sortedArray(arr));
	}

}
