package com.turing.learning.DSA.JavaHackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.util.*;

public class SubArrayTest {
	
	SubArray solution = new SubArray();
	
	@Test
	public void simpleCase()
	{
		int[] arr = {3, 4};
		
		List<List<Integer>> result = solution.subArray(arr);
		
		List<Integer> list1 = result.get(0);
		List<Integer> list2 = result.get(1);
		List<Integer> list3 = result.get(2);
		
		assertEquals( 1, list1.size() );
		assertEquals( 1, list2.size() );
		assertEquals( 2, list3.size() );

	}
	
	@Test 
	public void middleCase()
	{
		int[] arr = {1, 2, 4};
		
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
	
	@Test 
	public void arraySizeFourCase()
	{
		int[] arr = {1, 2, 4, 5};
		
		List<List<Integer>> result = solution.subArray(arr);
		
		List<Integer> list1 = result.get(0);
		List<Integer> list2 = result.get(1);
		List<Integer> list3 = result.get(2);
		List<Integer> list4 = result.get(3);
		List<Integer> list5 = result.get(4);
		List<Integer> list6 = result.get(5);
		List<Integer> list7 = result.get(6);
		List<Integer> list8 = result.get(7);
		List<Integer> list9 = result.get(8);
		List<Integer> list10 = result.get(9);
		
		assertEquals( 1, list1.size() );
		assertEquals( 1, list2.size() );
		assertEquals( 1, list3.size() );
		assertEquals( 1, list4.size() );
		assertEquals( 2, list5.size() );
		assertEquals( 2, list6.size() );
		assertEquals( 2, list7.size() );
		assertEquals( 3, list8.size() );
		assertEquals( 3, list9.size() );
		assertEquals( 4, list10.size() );

	}
	
	@Test 
	public void countNegativeSumSubArraySimplCase()
	{
		int[] arr = {3, -4};
		
		int result = solution.negativeSumSubArray(arr);
		
		assertEquals( 2, result );

	}
	
	@Test 
	public void countNegativeSumSubArrayAverageCase()
	{
		int[] arr = {1, -2, -3};
		
		int result = solution.negativeSumSubArray(arr);
		
		assertEquals( 5, result );
		
	}

}
