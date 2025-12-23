package com.turing.learning.DSA.sortingAlgo;

public class ShellSort implements SortingAlgo {

	@Override
	public int[] sort(int[] arr) {
		
		// gap = (gap / 2);
		int gap = arr.length / 2;
		
		while ( gap != 0 )
		{
			for ( int i = gap; i < arr.length ; i++ )
			{
				// compare
				// swap
				// gap/2
				int j = i;
				int temp = arr[i];
				
				//System.out.println("Before => "+"I :" + i + "," + "J :"+j);
				while (  j >= gap && arr[j-gap] > temp  )
				{
					arr[j] = arr[j - gap]; 
					j -= gap;
				}	
				arr[j] = temp;			
			}
			gap = gap /2;
			System.out.println("GAP :" + gap);
		}
		return arr;
	}

}
