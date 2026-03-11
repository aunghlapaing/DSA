package com.turing.learning.DSA.HackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ParallelProcessingTimeTest {
	
	ParallelProcessingTime ppt = new ParallelProcessingTime();
	
	@Test
	public void simpleInputCase()
	{
		
		int[] files = { 1, 4, 6 }; // list of processing time of one core without parallel processing
		int numCores = 2; // number of cores
		int limit = 1; // limit for parallel processing
		
		long minTotalProcessingTime = ppt.findMinTotalProcessingTime(files, numCores, limit);
		assertEquals( 8, minTotalProcessingTime );
	}
	
	@Test
	public void longInputCase()
	{
		int[] files = { 203040, 1, 4, 8 };
		int numCores = 4;
		int limit = 2;
		
		long minTotalProcessingTime = ppt.findMinTotalProcessingTime(files, numCores, limit);
		assertEquals( 50767, minTotalProcessingTime );
	}

}
