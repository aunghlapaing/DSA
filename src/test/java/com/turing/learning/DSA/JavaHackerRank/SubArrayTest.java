package com.turing.learning.DSA.JavaHackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.util.*;

public class SubArrayTest {
	
	@Test
	public void simpleCase()
	{
		SubArray solution = new SubArray();
		int[] arr = {1, 2, 3};
		
		List<List<Integer>> result = solution.subArray(arr);
		
		List<Integer> list1 = result.get(0);
		List<Integer> list2 = result.get(1);
		List<Integer> list3 = result.get(2);
		List<Integer> list4 = result.get(3);
		List<Integer> list5 = result.get(4);
		List<Integer> list6 = result.get(5);
		
		assertEquals( 1, list1.size() );
		assertEquals( 1, list2.size() );
		assertEquals( 1, list3.size() );
		assertEquals( 2, list4.size() );
		assertEquals( 2, list5.size() );
		assertEquals( 3, list6.size() );
	
	}

}
