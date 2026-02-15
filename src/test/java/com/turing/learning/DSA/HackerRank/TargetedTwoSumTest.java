package com.turing.learning.DSA.HackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class TargetedTwoSumTest {
	
	@Test
	public void twoItemCase()
	{
		TargetedTwoSum sum = new TargetedTwoSum();
		int[] arr = {1, 2};
		int[] result = sum.getTargetSum(arr, 3);
		for ( int i = 0; i < result.length; i++ )
		{
			assertEquals( i, result[i] );
		}
	}

}
