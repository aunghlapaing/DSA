package com.turing.learning.DSA.HackerRank;

import java.util.HashMap;

public class TargetedTwoSum {

	public int[] getTargetSum(int[] arr, int target) 
	{
		HashMap< Integer, Integer > map = new HashMap<>();
		for (int i = 0; i < arr.length; i++)
		{
			int sum = target - arr[i];
			if ( map.containsKey(sum) )
			{
				return new int[] { map.get(sum), i };
			}
			else
			{
				map.put(arr[i], i);
			}
		}
		return new int[] {};
	}

}
