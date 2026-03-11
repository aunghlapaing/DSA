package com.turing.learning.DSA.HackerRank;

import java.util.Arrays;

public class ParallelProcessingTime {

	public long findMinTotalProcessingTime(int[] files, int numCores, int limit) 
	{
		Arrays.sort(files);
		long result = 0L;
		for ( int i = files.length-1; i >= 0; i--)
		{
			if ( files[i] % numCores == 0 && limit > 0 )
			{
			     result += (long) ( files[i] / numCores );
			     limit--;
			}
			else
			{
			    result += (long) files[i];
			}
		}
		return result;
	}
	
	

}
