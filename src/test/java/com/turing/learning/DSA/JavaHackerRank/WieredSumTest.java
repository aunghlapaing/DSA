package com.turing.learning.DSA.JavaHackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import org.junit.jupiter.api.Test;

public class WieredSumTest {
	
	WieredSum sum = new WieredSum();
	
	@Test
	public void twoNumberSum()
	{

		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		
		List<String> result = sum.addFunc( list );
		assertEquals( "1+2=3", result.get(0) );
		
	}
	
	@Test
	public void listSizeOddNumberSum()
	{
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		List<String> result = sum.addFunc( list );
		assertEquals( "1+2=3", result.get(0) );
		assertEquals( "1+2+3=6", result.get(1) );
	}
	
	@Test
	public void weriedCaseSum()
	{
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		List<String> result = sum.addFunc( list );
		assertEquals( "1+2=3", result.get(0) );
		assertEquals( "1+2+3=6", result.get(1) );
		assertEquals( "1+2+3+4+5=15", result.get(2) );
		assertEquals( "1+2+3+4+5+6=21", result.get(3) );
	}

}
