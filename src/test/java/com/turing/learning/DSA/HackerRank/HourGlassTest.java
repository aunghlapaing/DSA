package com.turing.learning.DSA.HackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class HourGlassTest {

	//HourGlass hg = new HourGlass();
	HourGlassWithList hg = new HourGlassWithList();
	
	@Test
	public void singleHourGlassCase()
	{
		
		List<List<Integer>> list = new ArrayList<>();
		
		/*
		111
		010
		111	
		*/
		
		List<Integer> arr1 = new ArrayList<>();
		arr1.add(-1);
		arr1.add(-1);
		arr1.add(-1);
		
		list.add(arr1);
		
		List<Integer> arr2 = new ArrayList<>();
		arr2.add(-0);
		arr2.add(-1);
		arr2.add(-0);
		
		list.add(arr2);
		
		List<Integer> arr3 = new ArrayList<>();
		arr3.add(-1);
		arr3.add(-1);
		arr3.add(-1);
		
		list.add(arr3);
		
		int result = hg.hourGlassSum(list);
		assertEquals( -7, result );
		
	}
	
	@Test
	public void MultipleDimisionHourGlassCase()
	{
		List<List<Integer>> list = new ArrayList<>();
		
		/*
		1 1 1 0 0 0
		0 1 0 0 0 0
		1 1 1 0 0 0
		0 0 2 4 4 0
		0 0 0 2 0 0
		0 0 1 2 4 0
		*/
		
		List<Integer> arr1 = new ArrayList<>();
		// 1 1 1 0 0 0
		arr1.add(1);
		arr1.add(1);
		arr1.add(1);
		arr1.add(0);
		arr1.add(0);
		arr1.add(0);
		
		list.add(arr1);
		
		List<Integer> arr2 = new ArrayList<>();
		//0 1 0 0 0 0
		arr2.add(0);
		arr2.add(1);
		arr2.add(0);
		arr2.add(0);
		arr2.add(0);
		arr2.add(0);
		
		list.add(arr2);
		
		List<Integer> arr3 = new ArrayList<>();
		// 1 1 1 0 0 0
		arr3.add(1);
		arr3.add(1);
		arr3.add(1);
		arr3.add(0);
		arr3.add(0);
		arr3.add(0);
		
		list.add(arr3);
		
		List<Integer> arr4 = new ArrayList<>();
		// 0 0 2 4 4 0
		arr4.add(0);
		arr4.add(0);
		arr4.add(2);
		arr4.add(4);
		arr4.add(4);
		arr4.add(0);
		
		list.add(arr4);
		
		List<Integer> arr5 = new ArrayList<>();
		// 0 0 0 2 0 0
		arr5.add(0);
		arr5.add(0);
		arr5.add(0);
		arr5.add(2);
		arr5.add(0);
		arr5.add(0);
		
		list.add(arr5);
		
		List<Integer> arr6 = new ArrayList<>();
		// 0 0 1 2 4 0
		arr6.add(0);
		arr6.add(0);
		arr6.add(1);
		arr6.add(2);
		arr6.add(4);
		arr6.add(0);
		
		list.add(arr6);
		
		int result = hg.hourGlassSum(list);
		assertEquals( 19, result );
		
	}
	
}
