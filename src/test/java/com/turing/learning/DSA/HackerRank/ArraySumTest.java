package com.turing.learning.DSA.HackerRank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ArraySumTest {
	
	ArraySum arr = new ArraySum();
	
	List<Integer> a = new ArrayList<Integer>();
	List<Integer> b = new ArrayList<Integer>();	
	
	@Test
	public void equalCase()
	{
		a.add(2);
		a.add(4);
		a.add(9);
		
		b.add(7);
		b.add(4);
		b.add(1);
		
		List<Integer> result = arr.compareRating(a, b);
		Iterator<Integer> iterator = result.iterator();
		assertEquals(1, iterator.next());
		assertEquals(1, iterator.next());
		assertFalse( iterator.hasNext() );
	}
	
	@Test
	public void notEqualCase()
	{
		a.add(10);
		a.add(5);
		a.add(9);
		
		b.add(7);
		b.add(4);
		b.add(11);
		
		List<Integer> result = arr.compareRating(a, b);
		Iterator<Integer> iterator = result.iterator();
		assertEquals(2, iterator.next());
		assertEquals(1, iterator.next());
		assertFalse( iterator.hasNext() );
	}

}
