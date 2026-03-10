package com.turing.learning.DSA.HackerRank;

import java.util.Arrays;

public class RoadRepair {

	public long findMinDistance(int[] crew_id, int[] job_id) 
	{
		Arrays.sort(crew_id);
		Arrays.sort(job_id);
		long minDistance = 0L;
		for ( int i = 0; i < crew_id.length; i++ )
		{
			minDistance += Math.abs(crew_id[i] - job_id[i]);
		}
		return minDistance;
	}

}
