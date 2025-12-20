package com.turing.learning.DSA.searchAlgo;

public class BinarySearch implements SearchingAlgo {

	@Override
	public int search(int[] arr, int item) 
	{
		int left = 0;
		int right = arr.length - 1;
		
		while ( left <= right )
		{
			int middle = ( left + right ) / 2 ;
			if ( item == arr[middle] )
			{
				return middle;
			}
			else if ( item > arr[middle] )
			{
				left = middle + 1;
	
			}
			else if ( item < arr[middle] )
			{
				right = middle - 1;
			}
		}
		return -1;
	}
	
	public static void main (String[]args)
	{
		SearchingAlgo binarySearch = new BinarySearch();
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int index = binarySearch.search(arr, 5);
		System.out.println("Item found at :" + index);
	}

}
