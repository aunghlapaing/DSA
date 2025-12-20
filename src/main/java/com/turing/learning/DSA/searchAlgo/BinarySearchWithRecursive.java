package com.turing.learning.DSA.searchAlgo;

public class BinarySearchWithRecursive {


	public int search(int[] arr, int item, int left, int right) {
		
		if ( left > right ) // not found
		{
			return -1;
		}
		else 
		{
			int middle = ( left + right ) / 2;
			if ( arr[middle] == item )
			{
				return middle;
			}
			else if ( arr[middle] > item ) // move right
			{
				return search(arr, item, left, middle-1);
			}
			else if ( arr[middle] < item ) //move left
			{
				return search(arr, item, middle+1, right);
			}
			return middle;
		}
	
	}
	
	

}
