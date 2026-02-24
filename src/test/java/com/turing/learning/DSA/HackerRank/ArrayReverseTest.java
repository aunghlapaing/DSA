package com.turing.learning.DSA.HackerRank;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class ArrayReverseTest {
	
	ArrayReverse arrReverse = new ArrayReverse();
	List<Integer> input = new ArrayList<Integer>();
	int n;
	
	public ArrayReverseTest()
	{
		n = 4;
		
		input.add(4);
		input.add(2);
		input.add(1);
		input.add(3);
	}
	
	@Test 
	public void simpleInputCase()
	{
		List<Integer> result = arrReverse.reversePrint( n, input );
		assertEquals( 4, result.size() );
	}
}
