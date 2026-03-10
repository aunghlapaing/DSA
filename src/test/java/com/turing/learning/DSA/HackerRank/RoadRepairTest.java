package com.turing.learning.DSA.HackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoadRepairTest {
	RoadRepair rp = new RoadRepair();
	@Test
	public void baseCase()
	{
		
		int[] crew_id = {1, 3, 5};
		int[] job_id = {3, 5, 7};
		long minDistance = rp.findMinDistance(crew_id, job_id);
		assertEquals( 6, minDistance );
	}
	
	@Test
	public void longInputCase()
	{
		
		/*
		5 5 3 1 4 6
		5 9 8 3 15 1
		*/
		int[] crew_id = {5, 5, 3, 1, 4, 6};
		int[] job_id = {5, 9, 8, 3, 15, 1};
		long minDistance = rp.findMinDistance(crew_id, job_id);
		assertEquals( 17, minDistance );
	}

}
