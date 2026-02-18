package com.turing.learning.DSA.HackerRank;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MaxNumber {

	public int findMax(List<Integer> list) 
	{
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for ( Integer num : list )
		{
			queue.add(num);
		}
		Integer max = queue.poll();
		return max;
		
	}

}
