package com.turing.learning.DSA.HackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ReverseArrayTest {
	
	ReverseArray reverse = new ReverseArray();
	List<Integer> list = new ArrayList<Integer>();
	
	@Test
	public void reverseSimpleCase()
	{
		list.add(1);
		
		List<Integer> result = reverse.reserseArray(list);
		Iterator<Integer> iterator = result.iterator();
		assertEquals( 1, iterator.next() );
		assertFalse( iterator.hasNext() );
	}
	
	@Test
	public void reverseMultipleCase()
	{
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(9);
		
		List<Integer> result = reverse.reserseArray(list);
		Iterator<Integer> iterator = result.iterator();
		assertEquals( 9, iterator.next() );
		assertEquals( 5, iterator.next() );
		assertEquals( 3, iterator.next() );
		assertEquals( 1, iterator.next() );
		assertFalse( iterator.hasNext() );
	}
	
	@Test
	public void outOfBoundCase()
	{
		List<Integer> result = reverse.reserseArray(list);
		Iterator<Integer> iterator = result.iterator();
		assertFalse( iterator.hasNext() );
	}

}
