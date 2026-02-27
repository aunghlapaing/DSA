package com.turing.learning.DSA.HackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class BinaryConvertorTest {
	
	
	@Test
	public void simpleDecimalCase()
	{
		BinaryConvertor binary = new BinaryConvertor();
		
		List<Integer> result = binary.decimalToBinary(1);
		Iterator<Integer> iterator = result.iterator();
		assertEquals( 1, iterator.next() );
		assertFalse( iterator.hasNext() );
	}
	
	
	@Test
	public void complexDecimalCase()
	{
		BinaryConvertor binary = new BinaryConvertor();
		
		// 1000000
		List<Integer> result = binary.decimalToBinary(439);
		assertEquals( 9, result.size() );
	}

}
