package com.turing.learning.DSA.sortingAlgo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

public class ShellSortTest {
	
	SortingAlgo sortingAlgo = new ShellSort();
	Util util = new Util();
	
	@Test
	public void simpleItemCase()
	{
		int[] arr = {3, 2, 1, 5};
		
		sortingAlgo.sort(arr);
		
		assertTrue( util.sortedArray(arr));
		
	}
	
	@Test
	public void manyItemCase()
	{	
		int[] arr = {3, 4, 2, 6, 1, 9, 10, 8};
		
		sortingAlgo.sort(arr);
		
		System.out.println("Sorted Array: "+ Arrays.toString(arr));
		
		assertTrue( util.sortedArray(arr));
		
	}
	
	@Test
	public void randomArrayCase()
	{
		Random random = new Random();
		
		int[] arr = new int[20];
		for ( int i = 0; i < arr.length; i++ )
		{
			arr[i] = random.nextInt(200);
		}
		
		sortingAlgo.sort(arr);
		
		System.out.println("Sorted Array: "+ Arrays.toString(arr));
		
		assertTrue(util.sortedArray(arr));
	}

}
