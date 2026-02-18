package com.turing.learning.DSA.HackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MaxNumberTest {
	
	List<Integer> list = new ArrayList<Integer>();
	
	public MaxNumberTest()
	{
		list.add(10);
		list.add(5);
		list.add(6);
		list.add(15);		
		list.add(20);
	}
	
	@Test
	public void maxNumerCase()
	{
		MaxNumber max = new MaxNumber();
		int result = max.findMax(list);
		
		assertEquals( 20, result );
	}

}
